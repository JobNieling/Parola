package nl.han.oose.ooad.parola.application.question;

public abstract class Question {
    private String question;
    private String category;
    private Character letter;
    private boolean isActive;

    public Question(String question, String category, Character letter, boolean isActive) {
        this.question = question;
        this.category = category;
        this.letter = letter;
        this.isActive = isActive;
    }

    // getters and setters
    public abstract boolean checkAnswer(String answer);

    public abstract String getQuestionText();

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

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}