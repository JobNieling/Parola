package nl.han.oose.ooad.parola.application.question;

import java.util.ArrayList;

public class ShortAnswerQuestion extends Question {
    private ArrayList<Answer> answers;

    public ShortAnswerQuestion(String question, String category, Character letter, boolean isActive, ArrayList<Answer> answers) {
        super(question, category, letter, isActive);
        this.answers = answers;
    }

    @Override
    public boolean checkAnswer(String answer) {
        // implement the logic to check the answer
        return false;
    }

    // getters and setters
    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }
}