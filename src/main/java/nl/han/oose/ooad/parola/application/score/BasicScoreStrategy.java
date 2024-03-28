package nl.han.oose.ooad.parola.application.score;

import nl.han.oose.ooad.parola.application.GivenAnswer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BasicScoreStrategy implements ScoreStrategy{
    @Override
    public int calculateScore(LocalDateTime startTime, LocalDateTime endTime, ArrayList<GivenAnswer> playerAnswers, String word) {
        long duration = Duration.between(startTime, endTime).toMinutes();
        int wordLength = 0;
        if (word != null) {
            wordLength = word.length();
        }
        long correctAnswers = playerAnswers.stream().filter(GivenAnswer::isCorrect).count();

        int durationScore = (int) duration * 10;
        int wordLengthScore = wordLength * 5;
        int correctAnswersScore = (int) correctAnswers * 20;

        return wordLengthScore + correctAnswersScore + durationScore;
    }
}
