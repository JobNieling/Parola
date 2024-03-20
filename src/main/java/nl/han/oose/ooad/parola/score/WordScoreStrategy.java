package nl.han.oose.ooad.parola.score;

import nl.han.oose.ooad.parola.Player;
import nl.han.oose.ooad.parola.Quiz;

import java.util.List;

public class WordScoreStrategy implements ScoreStrategy {
    @Override
    public int calculateScore(Player player, Quiz quiz) {
        ArrayList<String> playerAnswers = player.getGivenAnswers();
        // Use an external library to check the word formed by the player's answers.
        // This is just a placeholder, replace it with the actual library call.
        boolean isWord = ExternalLibrary.checkWord(playerAnswers);
        return isWord ? playerAnswers.size() : 0;
    }
}