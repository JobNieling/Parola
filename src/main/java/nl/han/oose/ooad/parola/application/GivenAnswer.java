package nl.han.oose.ooad.parola.application;

import nl.han.oose.ooad.parola.application.question.Question;

public class GivenAnswer {

    private String answer;
    private Question question;
    private Boolean correct;

    public GivenAnswer(String answer, Question question) {
        this.answer = answer;
        this.question = question;
        this.correct = question.checkAnswer(answer);
    }

    public Character getLetterIfCorrect() {
        if (correct) {
            return question.getLetter();
        }
        return null;
    }
}
