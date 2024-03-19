package nl.han.oose.dea.seeds;

import java.util.List;

public class QuizSeed {
    private List<QuestionSeed> questions;

    public QuizSeed(List<QuestionSeed> questions) {
        this.questions = questions;
    }

    public List<QuestionSeed> getQuestions() {
        return questions;
    }
}