package nl.han.oose.ooad.parola.score;

import nl.han.oose.ooad.parola.GivenAnswer;
import nl.han.oose.ooad.parola.Player;
import nl.han.oose.ooad.parola.Quiz;

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