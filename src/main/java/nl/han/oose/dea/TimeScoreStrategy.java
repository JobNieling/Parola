package nl.han.oose.dea;

import java.time.Duration;

public class TimeScoreStrategy implements ScoreStrategy {
    @Override
    public int calculateScore(Player player, Quiz quiz) {
        Duration duration = Duration.between(player.getStartTime(), player.getEndTime());
        // The faster the player finishes the quiz, the higher the score.
        // This is just an example, you can adjust the formula as needed.
        return (int) (1000 - duration.toSeconds());
    }
}