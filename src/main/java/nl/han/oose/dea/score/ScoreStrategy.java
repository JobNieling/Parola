package nl.han.oose.dea.score;

import nl.han.oose.dea.Player;
import nl.han.oose.dea.Quiz;

public interface ScoreStrategy {
    int calculateScore(Player player, Quiz quiz);
}
