package nl.han.oose.dea;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class QuizPerformance {
    private Quiz quiz;
    private Player player;
    private ScoreStrategy scoreStrategy;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<String> playerAnswers;

    public QuizPerformance(Quiz quiz, Player player, ScoreStrategy scoreStrategy) {
        this.quiz = quiz;
        this.player = player;
        this.scoreStrategy = scoreStrategy;
        this.startTime = LocalDateTime.now();
        this.playerAnswers = new ArrayList<>();
    }

    public void start() {
        int score = scoreStrategy.calculateScore(player, quiz);
    }

    public void end() {
        this.endTime = LocalDateTime.now();
    }

    public void addAnswer(String answer) {
        this.playerAnswers.add(answer);
    }

    // getters and setters...
}