package nl.han.oose.ooad.parola;

import java.util.ArrayList;

public class Answer {
    private ArrayList<String> answers;

    public Answer(ArrayList<String> answers) {
        this.answers = answers;
    }

    // getters and setters

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
}