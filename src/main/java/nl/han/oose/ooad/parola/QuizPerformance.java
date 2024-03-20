package nl.han.oose.ooad.parola;

import nl.han.oose.ooad.parola.score.ScoreStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class QuizPerformance {
    private Quiz quiz;
    private Player player;
    private ScoreStrategy scoreStrategy;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ArrayList<String> playerAnswers;

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

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ScoreStrategy getScoreStrategy() {
        return scoreStrategy;
    }

    public void setScoreStrategy(ScoreStrategy scoreStrategy) {
        this.scoreStrategy = scoreStrategy;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public ArrayList<String> getPlayerAnswers() {
        return playerAnswers;
    }

    public void setPlayerAnswers(ArrayList<String> playerAnswers) {
        this.playerAnswers = playerAnswers;
    }

    public void addPlayerAnswer(String playerAnswer) {
        this.playerAnswers.add(playerAnswer);
    }

    public void removePlayerAnswer(String playerAnswer) {
        this.playerAnswers.remove(playerAnswer);
    }

    public void addPlayerAnswers(ArrayList<String> playerAnswers) {
        this.playerAnswers.addAll(playerAnswers);
    }

    public void removePlayerAnswers(ArrayList<String> playerAnswers) {
        this.playerAnswers.removeAll(playerAnswers);
    }
}