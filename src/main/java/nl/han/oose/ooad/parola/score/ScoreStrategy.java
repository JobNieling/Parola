package nl.han.oose.ooad.parola.score;

import nl.han.oose.ooad.parola.domain.Player;
import nl.han.oose.ooad.parola.domain.Quiz;

public interface ScoreStrategy {
    int calculateScore(Player player, Quiz quiz);
}
