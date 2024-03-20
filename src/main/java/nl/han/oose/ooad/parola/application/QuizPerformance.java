package nl.han.oose.ooad.parola.application;

import nl.han.oose.ooad.parola.application.question.Question;
import nl.han.oose.ooad.parola.application.score.ScoreStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class QuizPerformance {
    private Quiz quiz;
    private int score;
    private ScoreStrategy scoreStrategy;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ArrayList<GivenAnswer> playerAnswers = new ArrayList<>();
    private String word;

    public QuizPerformance(Quiz quiz, ScoreStrategy scoreStrategy) {
        this.quiz = quiz;
        this.scoreStrategy = scoreStrategy;
        start();
    }

    public void start() {
        startTime = LocalDateTime.now();
    }

    public void end() {
        endTime = LocalDateTime.now();
        score = scoreStrategy.calculateScore(startTime, endTime, playerAnswers, word);
    }

    public Question getNextQuestion() {
        return quiz.getQuestions().get(playerAnswers.size());
    }

    public void processAnswer(String answer) {
        Question question = quiz.getQuestions().get(playerAnswers.size());
        playerAnswers.add(new GivenAnswer(answer, question));
    }

    public boolean checkQuizFinished() {
        return playerAnswers.size() == quiz.getQuestions().size();
    }

    public ArrayList<Character> getLetters() {
        ArrayList<Character> letters = new ArrayList<>();
        for (GivenAnswer givenAsnwer : playerAnswers) {
            letters.add(givenAsnwer.getLetterIfCorrect());
        }
        return letters;
    }

    // getters and setters...
}