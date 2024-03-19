package nl.han.oose.dea;

public abstract class Question {
    private String question;
    private String category;
    private String letter;
    private boolean isActive;

    public Question(String question, String category, String letter, boolean isActive) {
        this.question = question;
        this.category = category;
        this.letter = letter;
        this.isActive = isActive;
    }

    // getters and setters
    public abstract boolean checkAnswer(Answer answer);
}