package nl.han.oose.ooad.parola.application;

import nl.han.oose.ooad.parola.application.question.Question;
import nl.han.oose.ooad.parola.application.score.*;

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
    public static final String SCORE_STRATEGY_BASIC = "SCORE_STRATEGY_BASIC";
    public static final String SCORE_STRATEGY_CORRECT_ANSWERS = "SCORE_STRATEGY_CORRECT_ANSWERS";
    public static final String SCORE_STRATEGY_TIME_BASED = "SCORE_STRATEGY_TIME_BASED";
    public static final String SCORE_STRATEGY_WORD_LENGTH = "SCORE_STRATEGY_WORD_LENGTH";

    public QuizPerformance(Quiz quiz) {
        this(quiz, SCORE_STRATEGY_BASIC);
    }

    public QuizPerformance(Quiz quiz, String scoreStrategyName) {
        this.quiz = quiz;
        switch (scoreStrategyName) {
            case SCORE_STRATEGY_BASIC -> this.scoreStrategy = new BasicScoreStrategy();
            case SCORE_STRATEGY_CORRECT_ANSWERS -> this.scoreStrategy = new CorrectAnswersScoreStrategy();
            case SCORE_STRATEGY_TIME_BASED -> this.scoreStrategy = new TimeBasedScoreStrategy();
            case SCORE_STRATEGY_WORD_LENGTH -> this.scoreStrategy = new WordLengthScoreStrategy();
            default -> throw new RuntimeException("Invalid score strategy!");
        }
        startTime = LocalDateTime.now();
    }

    public int finalizeQuizPerformance(String word) {
        //TODO: Validate that the word is made up of available letters.
        this.word = word;
        endTime = LocalDateTime.now();
        score = scoreStrategy.calculateScore(startTime, endTime, playerAnswers, word);
        return score;
    }

    public Question getNextQuestion() {
        return quiz.getQuestions().get(playerAnswers.size());
    }

    public String getNextQuestionText() {
        return getNextQuestion().getQuestionText();
    }

    public void processAnswer(String answer) {
        Question question = getNextQuestion();
        playerAnswers.add(new GivenAnswer(answer, question));
    }

    public boolean checkQuizFinished() {
        return playerAnswers.size() == quiz.getQuestions().size();
    }

    public String getLetterString() {
        String letterString = "";
        for (GivenAnswer givenAnswer : playerAnswers) {
            Character c = givenAnswer.getLetterIfCorrect();
            if (c != null) {
                letterString = letterString + c + " ";
            }
        }
        return letterString;
    }

    // getters and setters...

    public Quiz getQuiz() {
        return quiz;
    }
}