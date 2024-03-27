package nl.han.oose.ooad.parola.application;

import nl.han.oose.ooad.parola.DataBuilder;

import java.util.ArrayList;
import java.util.Objects;

public class ParolaController {
    private ArrayList<Player> players;
    private ArrayList<Quiz> quizzes;

    public static ParolaController getInstance() {
        DataBuilder dataBuilder = new DataBuilder();
        ParolaController parolaController = new ParolaController();
        parolaController.setPlayers(dataBuilder.buildDummyPlayers("speler"));
        parolaController.setQuizzes(dataBuilder.buildDummyQuizzen());
        return parolaController;
    }

    public void startQuiz(String playername) {
        Player player = getPlayer(playername);
        if (player.payCredits(40)) {
            player.startNewQuiz(quizzes);
        } else {
            throw new RuntimeException(playername + " heeft niet genoeg credits om een nieuwe quiz te spelen!");
        }
    }

    public String nextQuestion(String playername) {
        Player player = getPlayer(playername);
        return player.getNextQuestionTextFromCurrentQuiz();
    }

    public void processAnswer(String playername, String answer) {
        Player player = getPlayer(playername);
        player.processAnswerForCurrentQuiz(answer);
    }

    public boolean quizFinished(String playername) {
        Player player = getPlayer(playername);
        return player.checkCurrentQuizFinished();
    }

    public String getLettersForRightAnswers(String playername) {
        Player player = getPlayer(playername);
        return player.getLettersForRightAnswersFromCurrentQuiz();
    }

    public int calculateScore(String playername, String word) {
        Player player = getPlayer(playername);
        return player.finalizeCurrentQuiz(word);
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

    public ArrayList<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(ArrayList<Quiz> quizzes) {
        this.quizzes = quizzes;
    }
}
