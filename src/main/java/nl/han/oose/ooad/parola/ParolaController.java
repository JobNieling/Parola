package nl.han.oose.ooad.parola;

import nl.han.oose.ooad.parola.domain.Player;
import nl.han.oose.ooad.parola.domain.Quiz;

import java.util.ArrayList;

public class ParolaController {
    private ArrayList<Player> players;
    private ArrayList<Quiz> quizzen;

    public static ParolaController getInstance() {
        return new ParolaController();
    }

    public void startQuiz(String playername) {
        // Start the quiz
    }

    public String nextQuestion(String playername) {
        // Get the next question
        return "What is the capital of France?";
    }

    public void processAnswer(String playername, String answer) {
        // Process the answer
    }

    public boolean quizFinished(String playername) {
        // Check if the quiz is finished
        return false;
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

    public String getLettersForRightAnswers(String playername) {
        return null;
    }

    public int calculateScore(String playername, String word) {
        return 0;
    }
}
