package nl.han.oose.dea;

import java.util.List;

public class Player {
    private String username;
    private String password;
    private int credits;
    private List<QuizPerformance> quizPerformances;

    public Player(String username, String password, int credits, List<QuizPerformance> quizPerformances) {
        this.username = username;
        this.password = password;
        this.credits = credits;
        this.quizPerformances = quizPerformances;
    }

    // getters and setters
}