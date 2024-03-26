package nl.han.oose.ooad.parola.application.score;

import nl.han.oose.ooad.parola.application.GivenAnswer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TimeBasedScoreStrategy implements ScoreStrategy {
    @Override
    public int calculateScore(LocalDateTime startTime, LocalDateTime endTime, ArrayList<GivenAnswer> playerAnswers, String word) {
        // Calculate the duration between the start and end time in minutes
        long duration = Duration.between(startTime, endTime).toMinutes();

        // Calculate the score: for every minute played, the player loses 10 points
        // The maximum amount of time is 10 minutes, so the maximum score loss is 100 points
        int score = (int) duration * 10;

        return score;
    }
}
