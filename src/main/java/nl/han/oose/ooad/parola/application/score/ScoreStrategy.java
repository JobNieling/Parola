package nl.han.oose.ooad.parola.application.score;

import nl.han.oose.ooad.parola.application.GivenAnswer;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface ScoreStrategy {

    int calculateScore(LocalDateTime startTime, LocalDateTime endTime, ArrayList<GivenAnswer> playerAnswers, String word);
}
