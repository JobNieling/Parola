package nl.han.oose.dea;

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
}
