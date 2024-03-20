package nl.han.oose.ooad.parola;

import java.util.List;

public class GivenAnswer {

    private List<String> answer;
    private List<Boolean> correct;

    public GivenAnswer(List<String> answer, List<Boolean> correct) {
        this.answer = answer;
        this.correct = correct;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public List<Boolean> getCorrect() {
        return correct;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }

    public void setCorrect(List<Boolean> correct) {
        this.correct = correct;
    }
}
