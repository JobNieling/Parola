package nl.han.oose.ooad.parola;

public class ParolaController {
    private Player player;
    private Quiz quiz;

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

    public String getLettersForRightAnswers(String playername) {
        return null;
    }

    public int calculateScore(String playername, String word) {
        return 0;
    }
}
