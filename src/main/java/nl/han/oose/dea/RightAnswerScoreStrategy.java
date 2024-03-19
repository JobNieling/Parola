package nl.han.oose.dea;

public class RightAnswerScoreStrategy implements ScoreStrategy {
    @Override
    public int calculateScore(Player player, Quiz quiz) {
        int score = 0;
        for (GivenAnswer answer : player.getGivenAnswers()) {
            if (quiz.isCorrectAnswer(answer)) {
                score++;
            }
        }
        return score;
    }
}