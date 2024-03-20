package nl.han.oose.ooad.parola.application;

import java.util.ArrayList;

public class Player {
    private String username;
    private String password;
    private int credits;
    private
    ArrayList<QuizPerformance> quizPerformances = new ArrayList<>();

    public Player(String username, String password, int credits) {
        this.username = username;
        this.password = password;
        this.credits = credits;
    }

    public boolean payCredits(int i) {
        if (credits >= i) {
            credits -= i;
            return true;
        }
        return false;
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