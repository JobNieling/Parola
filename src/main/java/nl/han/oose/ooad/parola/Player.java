package nl.han.oose.ooad.parola;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String username;
    private String password;
    private int credits;
    private
    ArrayList<QuizPerformance> quizPerformances;

    public Player(String username, String password, int credits, ArrayList<QuizPerformance> quizPerformances) {
        this.username = username;
        this.password = password;
        this.credits = credits;
        this.quizPerformances = quizPerformances;
    }

    // getters and setters

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setQuizPerformances(ArrayList<QuizPerformance> quizPerformances) {
        this.quizPerformances = quizPerformances;
    }

    public ArrayList<QuizPerformance> getQuizPerformances() {
        return quizPerformances;
    }

    public void addQuizPerformance(QuizPerformance quizPerformance) {
        quizPerformances.add(quizPerformance);
    }

    public void removeQuizPerformance(QuizPerformance quizPerformance) {
        quizPerformances.remove(quizPerformance);
    }
}