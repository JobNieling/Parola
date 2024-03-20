package nl.han.oose.ooad.parola.score;

import nl.han.oose.ooad.parola.domain.GivenAnswer;
import nl.han.oose.ooad.parola.domain.Player;
import nl.han.oose.ooad.parola.domain.Quiz;

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