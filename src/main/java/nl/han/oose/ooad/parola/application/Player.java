package nl.han.oose.ooad.parola.application;

import java.util.ArrayList;

public class Player {
    private String username;
    private String password;
    private int credits;
    private ArrayList<QuizPerformance> quizPerformances = new ArrayList<>();

    public Player(String username, String password, int credits) {
        this.username = username;
        this.password = password;
        this.credits = credits;
    }

    public boolean payCredits(int i) {
        if (credits >= i) {
            credits -= i;
            return true;
        }
        return false;
    }

    public void startNewQuiz(ArrayList<Quiz> quizzes) {
        ArrayList<Quiz> playedQuizzes = new ArrayList<>(quizPerformances.stream().map(QuizPerformance::getQuiz).toList());
        Quiz quiz = selectQuiz(quizzes, playedQuizzes);
        quizPerformances.add(new QuizPerformance(quiz));
    }

    public String getNextQuestionTextFromCurrentQuiz() {
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance();
        String nextQuestionText = currentQuizPerformance.getNextQuestionText();
        return nextQuestionText;
    }

    public void processAnswerForCurrentQuiz(String answer) {
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance();
        currentQuizPerformance.processAnswer(answer);
    }

    public boolean checkCurrentQuizFinished() {
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance();
        return currentQuizPerformance.checkQuizFinished();
    }

    public String getLettersForRightAnswersFromCurrentQuiz() {
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance();
        return currentQuizPerformance.getLetterString();
    }

    public int finalizeCurrentQuiz(String word) {
        QuizPerformance currentQuizPerformance = getCurrentQuizPerformance();
        return currentQuizPerformance.finalizeQuizPerformance(word);
    }

    private Quiz selectQuiz(ArrayList<Quiz> quizzes, ArrayList<Quiz> playedQuizzes) {
        ArrayList<Quiz> availableQuizzes = new ArrayList<>(quizzes);
        availableQuizzes.removeAll(playedQuizzes);
        Quiz quiz;
        if (!availableQuizzes.isEmpty()) {
            quiz = availableQuizzes.get((int) (Math.random() * availableQuizzes.size()));
        } else {
            quiz = quizzes.get((int) (Math.random() * quizzes.size()));
        }
        return quiz;
    }

    private QuizPerformance getCurrentQuizPerformance() {
        return quizPerformances.get(quizPerformances.size() - 1);
    }

    // getters and setters

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setQuizPerformances(ArrayList<QuizPerformance> quizPerformances) {
        this.quizPerformances = quizPerformances;
    }

    public ArrayList<QuizPerformance> getQuizPerformances() {
        return quizPerformances;
    }

    public void addQuizPerformance(QuizPerformance quizPerformance) {
        quizPerformances.add(quizPerformance);
    }

    public void removeQuizPerformance(QuizPerformance quizPerformance) {
        quizPerformances.remove(quizPerformance);
    }
}