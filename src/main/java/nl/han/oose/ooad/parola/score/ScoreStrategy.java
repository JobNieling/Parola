package nl.han.oose.ooad.parola.score;

import nl.han.oose.ooad.parola.Player;
import nl.han.oose.ooad.parola.Quiz;

public interface ScoreStrategy {
    int calculateScore(Player player, Quiz quiz);
}
