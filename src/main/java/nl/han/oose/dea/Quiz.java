package nl.han.oose.dea;

import java.util.List;

public class Quiz {
    private String quizName;
    private List<Question> questions;
    private List<QuizPerformance> quizPerformances;

    public Quiz(String quizName, List<Question> questions, List<QuizPerformance> quizPerformances) {
        this.quizName = quizName;
        this.questions = questions;
        this.quizPerformances = quizPerformances;
    }

    // getters and setters

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuizPerformances(List<QuizPerformance> quizPerformances) {
        this.quizPerformances = quizPerformances;
    }

    public List<QuizPerformance> getQuizPerformances() {
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