package nl.han.oose.ooad.parola;

import java.util.List;

public class Answer {
    private List<String> answers;

    public Answer(List<String> answers) {
        this.answers = answers;
    }

    // getters and setters

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}