package nl.han.oose.dea;

public class GivenAnswer {

    private String answer;
    private boolean correct;

    public GivenAnswer(String answer, boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GivenAnswer)) {
            return false;
        }
        GivenAnswer that = (GivenAnswer) o;
        return correct == that.correct && answer.equals(that.answer);
    }

    public int hashCode() {
        int result = answer.hashCode();
        result = 31 * result + (correct ? 1 : 0);
        return result;
    }

    public String toString() {
        return "GivenAnswer{" + "answer='" + answer + '\'' + ", correct=" + correct + '}';
    }

    public static void main(String[] args) {
        GivenAnswer givenAnswer = new GivenAnswer("answer", true);
        System.out.println(givenAnswer.getAnswer());
        System.out.println(givenAnswer.isCorrect());
        givenAnswer.setAnswer("new answer");
        givenAnswer.setCorrect(false);
        System.out.println(givenAnswer.getAnswer());
        System.out.println(givenAnswer.isCorrect());
    }
}
