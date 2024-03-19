package nl.han.oose.dea.score;

import nl.han.oose.dea.Player;
import nl.han.oose.dea.Quiz;
import nl.han.oose.dea.QuizPerformance;
import nl.han.oose.dea.score.ScoreStrategy;

import java.time.Duration;

public class TimeScoreStrategy implements ScoreStrategy {
    @Override
    public int calculateScore(Player player, Quiz quiz) {
        Duration duration = Duration.between(QuizPerformance.getStartTime(), QuizPerformance.getEndTime());
        // The faster the player finishes the quiz, the higher the score.
        // This is just an example, you can adjust the formula as needed.
        return (int) (1000 - duration.toSeconds());
    }
}