package nl.han.oose.dea.seeds;

public class QuizSeed {
    private String question;
    private String answer;

    public QuizSeed(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
