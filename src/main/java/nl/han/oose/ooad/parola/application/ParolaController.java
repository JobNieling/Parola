package nl.han.oose.ooad.parola.application;

import nl.han.oose.ooad.parola.DataBuilder;
import nl.han.oose.ooad.parola.application.question.Question;
import nl.han.oose.ooad.parola.application.score.BasicScoreStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ParolaController {
    private ArrayList<Player> players;
    private ArrayList<Quiz> quizzen;

    public static ParolaController getInstance() {
        DataBuilder dataBuilder = new DataBuilder();
        ParolaController parolaController = new ParolaController();
        parolaController.setPlayers(dataBuilder.buildDummyPlayers("speler"));
        parolaController.setQuizzen(dataBuilder.buildDummyQuizzen());
        return parolaController;
    }

    public void startQuiz(String playername) {
        // Start the quiz
        Player player = getPlayer(playername);
        if (player.payCredits(40)) {
            // Find unplayed quizzen
            ArrayList<Quiz> playedQuizzen = new ArrayList<>(player.getQuizPerformances().stream().map(QuizPerformance::getQuiz).toList());
            ArrayList<Quiz> unplayedQuizzen = new ArrayList<>(quizzen);
            for (Quiz playedQuiz : playedQuizzen) {
                unplayedQuizzen.remove(playedQuiz);
            }
            Collections.shuffle(unplayedQuizzen);
            Quiz quiz;
            if (!unplayedQuizzen.isEmpty()) {
                 quiz = unplayedQuizzen.get(0);
            } else {
                quiz = quizzen.get(0);
            }
            player.addQuizPerformance(new QuizPerformance(quiz, new BasicScoreStrategy()));
        } else {
            throw new RuntimeException(playername + "heeft niet genoeg credits om een nieuwe quiz te spelen!");
        }
    }

    private QuizPerformance getCurrentQuizPerformance(Player player) {
        ArrayList<QuizPerformance> QPs = player.getQuizPerformances();
        return QPs.get(QPs.size() - 1);
    }

    public String nextQuestion(String playername) {
        // Get the next question
        Player player = getPlayer(playername);
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance(player);
        Question question = currentQuizPerformance.getNextQuestion();
        return "\n" + question.getQuestionText();
    }

    public void processAnswer(String playername, String answer) {
        // Process the answer
        Player player = getPlayer(playername);
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance(player);
        currentQuizPerformance.processAnswer(answer);
    }

    public boolean quizFinished(String playername) {
        // Check if the quiz is finished
        Player player = getPlayer(playername);
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance(player);
        return currentQuizPerformance.checkQuizFinished();
    }

    public String getLettersForRightAnswers(String playername) {
        Player player = getPlayer(playername);
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance(player);
        ArrayList<Character> letters = currentQuizPerformance.getLetters();
        String letterString = "";
        for (Character c : letters) {
            if (c != null) {
                letterString = letterString + c + " ";
            }
        }
        return "\n" + letterString;
    }

    public int calculateScore(String playername, String word) {
        Player player = getPlayer(playername);
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance(player);
        currentQuizPerformance.end();
        return currentQuizPerformance.finalizeQuizPerformance(word);
    }

    private Player getPlayer(String playername) {
        for (Player player : players) {
            if (Objects.equals(player.getUsername(), playername)) {
                return player;
            }
        }
        throw new RuntimeException("De speler met naam \"" + playername + "\" kan niet worden gevonden!");
    }

    // getters and setters...

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Quiz> getQuizzen() {
        return quizzen;
    }

    public void setQuizzen(ArrayList<Quiz> quizzen) {
        this.quizzen = quizzen;
    }
}
