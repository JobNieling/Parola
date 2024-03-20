package nl.han.oose.ooad.parola.application;

import nl.han.oose.ooad.parola.DataBuilder;
import nl.han.oose.ooad.parola.application.question.Question;
import nl.han.oose.ooad.parola.application.score.BasicScoreStrategy;

import java.util.ArrayList;
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
            player.addQuizPerformance(new QuizPerformance(quizzen.get(0), new BasicScoreStrategy()));
        }
    }

    private QuizPerformance getCurrentQuizPerformance(Player player) {
        return player.getQuizPerformances().get(player.getQuizPerformances().size() - 1);
    }

    public String nextQuestion(String playername) {
        // Get the next question
        Player player = getPlayer(playername);
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance(player);
        Question question = currentQuizPerformance.getNextQuestion();
        return question.getQuestion();
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
            letterString = letterString + c + " ";
        }
        return letterString;
    }

    public int calculateScore(String playername, String word) {
        return 0;
    }

    // getters and setters...

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Player getPlayer(String playername) {
        for (Player player : players) {
            if (Objects.equals(player.getUsername(), playername)) {
                return player;
            }
        }
        throw new RuntimeException("Player not found");
    }

    public ArrayList<Quiz> getQuizzen() {
        return quizzen;
    }

    public void setQuizzen(ArrayList<Quiz> quizzen) {
        this.quizzen = quizzen;
    }
}
