package nl.han.oose.dea;

import nl.han.oose.dea.score.ScoreStrategy;

public class ParolaController {
    private Player player;
    private Quiz quiz;
    private ScoreStrategy scoreStrategy;

    public static ParolaController getInstance() {
        return new ParolaController();
    }

    public void startQuiz(String playername) {
        // Start the quiz
    }

    public String nextQuestion(String playername) {
        // Get the next question
        return "What is the capital of France?";
    }

    public void processAnswer(String playername, String answer) {
        // Process the answer
    }

    public boolean quizFinished(String playername) {
        // Check if the quiz is finished
        return false;
    }

    public String getLettersForRightAnswers(String playername) {
        // Get the letters for the right answers
        return "A, B, C";
    }

    public int calculateScore(String playername, String word) {
        // Calculate the score
        return scoreStrategy.calculateScore(player, quiz);
    }

    // getters and setters...

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public ScoreStrategy getScoreStrategy() {
        return scoreStrategy;
    }

    public void setScoreStrategy(ScoreStrategy scoreStrategy) {
        this.scoreStrategy = scoreStrategy;
    }
}
