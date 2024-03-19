package nl.han.oose.dea;

import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<Answer> wrongAnswers;
    private Answer rightAnswer;

    public MultipleChoiceQuestion(String question, String category, String letter, boolean isActive, List<Answer> wrongAnswers, Answer rightAnswer) {
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
}