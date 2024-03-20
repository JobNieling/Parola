package nl.han.oose.ooad.parola.score;

import nl.han.oose.ooad.parola.domain.Player;
import nl.han.oose.ooad.parola.domain.Quiz;
import nl.han.oose.ooad.parola.domain.QuizPerformance;

import java.time.Duration;

public class TimeScoreStrategy implements ScoreStrategy {

    private QuizPerformance quizPerformance;
    @Override
    public int calculateScore(Player player, Quiz quiz) {
        Duration duration = Duration.between(quizPerformance.getStartTime(), quizPerformance.getEndTime());
        // The faster the player finishes the quiz, the higher the score.
        // This is just an example, you can adjust the formula as needed.
        return (int) (1000 - duration.toSeconds());
    }
}