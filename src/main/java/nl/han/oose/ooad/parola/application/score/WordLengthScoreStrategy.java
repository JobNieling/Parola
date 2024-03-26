package nl.han.oose.ooad.parola.application.score;

import nl.han.oose.ooad.parola.application.GivenAnswer;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class WordLengthScoreStrategy implements ScoreStrategy {
    @Override
    public int calculateScore(LocalDateTime startTime, LocalDateTime endTime, ArrayList<GivenAnswer> playerAnswers, String word) {
        // Calculate the length of the word
        int wordLength = word.length();

        // Calculate the score: for every character in the word, the player gets 5 points
        int score = wordLength * 5;

        return score;
    }
}