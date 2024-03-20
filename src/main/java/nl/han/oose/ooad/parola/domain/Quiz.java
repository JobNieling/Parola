package nl.han.oose.ooad.parola.domain;

import nl.han.oose.ooad.parola.domain.question.Question;
import nl.han.oose.ooad.parola.score.ScoreStrategy;

import java.util.ArrayList;

public class Quiz {
    private String quizName;
    private ArrayList<Question> questions;
    private ArrayList<QuizPerformance> quizPerformances;

    public Quiz(String quizName, ArrayList<Question> questions, ArrayList<QuizPerformance> quizPerformances) {
        this.quizName = quizName;
        this.questions = questions;
        this.quizPerformances = quizPerformances;
    }

    // methods
    public void startQuiz(Player player, ScoreStrategy scoreStrategy) {
        QuizPerformance quizPerformance = new QuizPerformance(this, player, scoreStrategy);
        quizPerformance.start();
    }

    public void endQuiz() {
        for (QuizPerformance quizPerformance : quizPerformances) {
            quizPerformance.end();
        }
    }

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

    public void setQuizPerformances(ArrayList<QuizPerformance> quizPerformances) {
        this.quizPerformances = quizPerformances;
    }

    public ArrayList<QuizPerformance> getQuizPerformances() {
        return quizPerformances;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public void addQuizPerformance(QuizPerformance quizPerformance) {
        quizPerformances.add(quizPerformance);
    }

    public void removeQuizPerformance(QuizPerformance quizPerformance) {
        quizPerformances.remove(quizPerformance);
    }
}