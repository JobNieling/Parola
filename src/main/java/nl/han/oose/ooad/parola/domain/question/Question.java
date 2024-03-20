package nl.han.oose.ooad.parola.domain.question;

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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}