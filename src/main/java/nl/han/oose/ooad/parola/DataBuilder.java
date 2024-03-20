package nl.han.oose.ooad.parola;

import nl.han.oose.ooad.parola.application.Player;
import nl.han.oose.ooad.parola.application.Quiz;
import nl.han.oose.ooad.parola.application.question.Answer;
import nl.han.oose.ooad.parola.application.question.MultipleChoiceQuestion;
import nl.han.oose.ooad.parola.application.question.Question;
import nl.han.oose.ooad.parola.application.question.ShortAnswerQuestion;

import java.util.ArrayList;

public class DataBuilder {
    public ArrayList<Quiz> buildDummyQuizzen() {
        ArrayList<Quiz> quizzen = new ArrayList<>();
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new ShortAnswerQuestion("Name any country in the Benelux", "generic", 'C', true, buildAnswerArrayList("The Netherlands", "Netherlands", "Belgium", "Luxemburg", "Luxembourg")));
        questions.add(new MultipleChoiceQuestion("What is the capital of the Netherlands", "generic", 'C', true, new Answer("Amsterdam"), buildAnswerArrayList("The Hague", "Berlin", "Copenhagen")));

        quizzen.add(new Quiz("Dummy quiz", questions));
        return quizzen;
    }

    public ArrayList<Player> buildDummyPlayers(String... playernames) {
        ArrayList<Player> players = new ArrayList<>();
        for (String playername : playernames) {
            players.add(new Player(playername, "password", 1000));
        }
        return players;
    }

    private ArrayList<Answer> buildAnswerArrayList(String... asnwerText) {
        ArrayList<Answer> arrayList = new ArrayList<>();
        for (String s : asnwerText) {
            arrayList.add(new Answer(s));
        }
        return arrayList;
    }
}
