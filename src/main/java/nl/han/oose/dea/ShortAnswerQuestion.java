package nl.han.oose.dea;

import java.util.List;

public class ShortAnswerQuestion extends Question {
    private List<Answer> answers;

    public ShortAnswerQuestion(String question, String category, String letter, boolean isActive, List<Answer> answers) {
        super(question, category, letter, isActive);
        this.answers = answers;
    }

    @Override
    public boolean checkAnswer(Answer answer) {
        // implement the logic to check the answer
        return false;
    }

    // getters and setters
}