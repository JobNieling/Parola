package nl.han.oose.dea.score;

import nl.han.oose.dea.GivenAnswer;
import nl.han.oose.dea.Player;
import nl.han.oose.dea.Quiz;
import nl.han.oose.dea.score.ScoreStrategy;

public class RightAnswerScoreStrategy implements ScoreStrategy {
    @Override
    public int calculateScore(Player player, Quiz quiz) {
        int score = 0;
        for (GivenAnswer answer : player.getGivenAnswers()) {
            if (quiz.isCorrectAnswer(answer)) {
                score++;
            }
        }
        return score;
    }
}