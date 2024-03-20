package nl.han.oose.ooad.parola.domain;

import java.util.ArrayList;

public class GivenAnswer {

    private ArrayList<String> answer;
    private ArrayList<Boolean> correct;

    public GivenAnswer(ArrayList<String> answer, ArrayList<Boolean> correct) {
        this.answer = answer;
        this.correct = correct;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public ArrayList<Boolean> getCorrect() {
        return correct;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }

    public void setCorrect(ArrayList<Boolean> correct) {
        this.correct = correct;
    }
}
