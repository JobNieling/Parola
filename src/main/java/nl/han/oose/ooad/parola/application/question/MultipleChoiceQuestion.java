package nl.han.oose.ooad.parola.application.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MultipleChoiceQuestion extends Question {
    private ArrayList<String> wrongAnswers;
    private String rightAnswer;

    public MultipleChoiceQuestion(String question, String category, Character letter, boolean isActive, String rightAnswer, ArrayList<String> wrongAnswers) {
        super(question, category, letter, isActive);
        this.wrongAnswers = wrongAnswers;
        this.rightAnswer = rightAnswer;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return Objects.equals(answer, rightAnswer);
    }

    @Override
    public String getQuestionText() {
        List<String> allAsnwers = new ArrayList<>();
        allAsnwers.add(rightAnswer);
        allAsnwers.addAll(wrongAnswers);
        Collections.shuffle(allAsnwers);
        return getCategory() + " - " + getQuestion() + " " + allAsnwers;
    }

    // getters and setters

    public ArrayList<String> getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(ArrayList<String> wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}