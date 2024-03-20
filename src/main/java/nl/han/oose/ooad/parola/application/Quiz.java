package nl.han.oose.ooad.parola.application;

import nl.han.oose.ooad.parola.application.question.Question;

import java.util.ArrayList;

public class Quiz {
    private String quizName;
    private ArrayList<Question> questions;

    public Quiz(String quizName, ArrayList<Question> questions) {
        this.quizName = quizName;
        this.questions = questions;
    }

    // methods

    // getters and setters

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }
}