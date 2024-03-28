package nl.han.oose.ooad.parola.application;

import nl.han.oose.ooad.parola.application.question.Question;
import nl.han.oose.ooad.parola.application.score.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class QuizPerformance {
    private final Quiz quiz;
    private int score;
    private final ScoreStrategy scoreStrategy;
    private final LocalDateTime startTime;
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
        if (checkWordValid(word)) {
            this.word = word;
        }
        endTime = LocalDateTime.now();
        score = scoreStrategy.calculateScore(startTime, endTime, playerAnswers, this.word);
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
        for (Character c : getLettersFromCorrectAnswers()) {
            letterString = letterString + c + " ";
        }
        return letterString;
    }

    private ArrayList<Character> getLettersFromCorrectAnswers() {
        ArrayList<Character> charList = new ArrayList<>();
        for (GivenAnswer givenAnswer : playerAnswers) {
            Character c = givenAnswer.getLetterIfCorrect();
            if (c != null) {
                charList.add(c);
            }
        }
        return charList;
    }

    private boolean checkWordValid(String word) {
        ArrayList<Character> availableLetters = getLettersFromCorrectAnswers();
        for (Character c : word.toUpperCase().toCharArray()) {
            c = Character.toUpperCase(c);
            if (!availableLetters.remove(c)) {
                return false;
            }
        }
        return true;
    }

    // getters and setters...

    public Quiz getQuiz() {
        return quiz;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ScoreStrategy getScoreStrategy() {
        return scoreStrategy;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public ArrayList<GivenAnswer> getPlayerAnswers() {
        return playerAnswers;
    }

    public void setPlayerAnswers(ArrayList<GivenAnswer> playerAnswers) {
        this.playerAnswers = playerAnswers;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}