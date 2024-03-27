package nl.han.oose.ooad.parola.application.question;

import java.util.ArrayList;
import java.util.Objects;

public class ShortAnswerQuestion extends Question {
    private ArrayList<String> answers;

    public ShortAnswerQuestion(String question, String category, Character letter, boolean isActive, ArrayList<String> answers) {
        super(question, category, letter, isActive);
        this.answers = answers;
    }

    @Override
    public boolean checkAnswer(String answer) {
        for (String rightAnswer : answers) {
            if (Objects.equals(answer.toLowerCase(), rightAnswer.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getQuestionText() {
        return "\n" + getCategory() + " - " + getQuestion();
    }

    // getters and setters
    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
}