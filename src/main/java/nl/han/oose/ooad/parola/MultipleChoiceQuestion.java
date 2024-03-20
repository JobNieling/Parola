package nl.han.oose.ooad.parola;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
    private ArrayList<Answer> wrongAnswers;
    private Answer rightAnswer;

    public MultipleChoiceQuestion(String question, String category, String letter, boolean isActive, ArrayList<Answer> wrongAnswers, Answer rightAnswer) {
        super(question, category, letter, isActive);
        this.wrongAnswers = wrongAnswers;
        this.rightAnswer = rightAnswer;
    }

    @Override
    public boolean checkAnswer(Answer answer) {
        // implement the logic to check the answer
        return false;
    }

    // getters and setters

    public ArrayList<Answer> getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(ArrayList<Answer> wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    public Answer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Answer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}