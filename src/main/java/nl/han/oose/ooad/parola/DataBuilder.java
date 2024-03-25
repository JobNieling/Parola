package nl.han.oose.ooad.parola;

import nl.han.oose.ooad.parola.application.Player;
import nl.han.oose.ooad.parola.application.Quiz;
    import nl.han.oose.ooad.parola.application.question.MultipleChoiceQuestion;
import nl.han.oose.ooad.parola.application.question.Question;
import nl.han.oose.ooad.parola.application.question.ShortAnswerQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class DataBuilder {
    public ArrayList<Quiz> buildDummyQuizzen() {
        ArrayList<Quiz> quizzen = new ArrayList<>();
        ArrayList<Question> questions = new ArrayList<>();

//        questions.add(new MultipleChoiceQuestion("What is the capital of the Netherlands?", "Geography", 'A', true, "Amsterdam", buildStringArrayList("The Hague", "Berlin", "Copenhagen")));
//        questions.add(new ShortAnswerQuestion("Name any country in the Benelux.", "Geography", 'N', true, buildStringArrayList("The Netherlands", "Netherlands", "Belgium", "Luxemburg", "Luxembourg")));

        questions.add(new MultipleChoiceQuestion(
                "Wat is de hoofdstad van Libië?",
                "Aardrijkskunde",
                'T',
                true,
                "Tripoli", buildStringArrayList("Bayda", "Benghazi", "Misrata")
        ));
        questions.add(new MultipleChoiceQuestion(
                "Hoe heet het officieuze landenkampioenschap tennis voor mannen?",
                "Sport",
                'D',
                true,
                "Davis Cup", buildStringArrayList("Diamond League", "Fed Cup", "Nations League")
        ));
        questions.add(new MultipleChoiceQuestion(
                "Hoe heet de schrijver van de Millennium-trilogie, een reeks misdaadromans? Het eerste boek uit de reeks heet \"Mannen die vrouwen haten\".",
                "Literatuur",
                'L',
                true,
                "Stieg Larsson", buildStringArrayList("Henning Mankell", "Jo Nesbø", "Lars Kepler")
        ));
        questions.add(new MultipleChoiceQuestion(
                "Welke van de volgende Engelse voetbalclubs is afkomstig uit Liverpool?",
                "Sport",
                'E',
                true,
                "Everton", buildStringArrayList("Arsenal", "Chelsea", "Tottenham Hotspur")
        ));
        questions.add(new ShortAnswerQuestion(
                "In welke staat van de VS ligt de stad Los Angeles?",
                "Aardrijkskunde",
                'C',
                true,
                buildStringArrayList("California", "Californië")
        ));
        questions.add(new ShortAnswerQuestion(
                "Wat is de artiestnaam van de rapper Marshall Bruce Mathers III?",
                "Muziek",
                'E',
                true,
                buildStringArrayList("Eminem")
        ));
        questions.add(new ShortAnswerQuestion(
                "Mathieu van der Poel en zijn vader, die ook wielrenner was, hebben allebei de gele trui gedragen in de Tour de France. Wat is de voornaam van de vader van Mathieu?",
                "Sport",
                'A',
                true,
                buildStringArrayList("Adri", "Adrie")
        ));
        questions.add(new ShortAnswerQuestion(
                "Hoe noem je een persoon die zich bezighoudt met bijenteelt?",
                "_____",
                'I',
                true,
                buildStringArrayList("Imker", "Bijker", "imker", "bijker")
        ));

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

    private ArrayList<String> buildStringArrayList(String... answerText) {
        return new ArrayList<>(Arrays.asList(answerText));
    }
}
