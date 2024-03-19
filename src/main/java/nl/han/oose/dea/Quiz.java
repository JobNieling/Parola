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
}