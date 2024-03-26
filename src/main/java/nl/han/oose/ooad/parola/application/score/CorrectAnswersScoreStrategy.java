package nl.han.oose.ooad.parola.application.score;

import nl.han.oose.ooad.parola.application.GivenAnswer;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CorrectAnswersScoreStrategy implements ScoreStrategy {
    @Override
    public int calculateScore(LocalDateTime startTime, LocalDateTime endTime, ArrayList<GivenAnswer> playerAnswers, String word) {
        // Calculate the number of correct answers
        long correctAnswers = playerAnswers.stream().filter(GivenAnswer::isCorrect).count();

        // Calculate the score: for every correct answer, the player gets 20 points
        int score = (int) correctAnswers * 20;

        return score;
    }
}