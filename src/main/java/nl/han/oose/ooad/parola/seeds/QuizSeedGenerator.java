package nl.han.oose.ooad.parola.seeds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizSeedGenerator {
    public QuizSeed generateQuizSeed() {
        List<QuestionSeed> questions = new ArrayList<>();
        questions.add(new MultipleChoiceQuestionSeed("What is the capital of Libya?", "Tripoli", Arrays.asList("Tripoli", "Benghazi", "Misrata", "Bayda")));
        questions.add(new ShortAnswerQuestionSeed("What is the artist name of the rapper Marshall Bruce Mathers III?", "Eminem"));
        questions.add(new MultipleChoiceQuestionSeed("What is the capital of the Netherlands?", "Amsterdam", Arrays.asList("Amsterdam", "Rotterdam", "The Hague", "Utrecht")));
        questions.add(new ShortAnswerQuestionSeed("What is the artist name of the singer Stefani Joanne Angelina Germanotta?", "Lady Gaga"));
        questions.add(new MultipleChoiceQuestionSeed("What is the capital of France?", "Paris", Arrays.asList("Paris", "Marseille", "Lyon", "Toulouse")));
        questions.add(new ShortAnswerQuestionSeed("What is the artist name of the singer Robyn Rihanna Fenty?", "Rihanna"));
        questions.add(new MultipleChoiceQuestionSeed("What is the capital of Germany?", "Berlin", Arrays.asList("Berlin", "Hamburg", "Munich", "Cologne")));
        questions.add(new ShortAnswerQuestionSeed("What is the artist name of the singer Katheryn Elizabeth Hudson?", "Katy Perry"));
        questions.add(new MultipleChoiceQuestionSeed("What is the capital of Italy?", "Rome", Arrays.asList("Rome", "Milan", "Naples", "Turin")));
        questions.add(new ShortAnswerQuestionSeed("What is the artist name of the singer Alecia Beth Moore?", "Pink"));
        questions.add(new MultipleChoiceQuestionSeed("What is the capital of Spain?", "Madrid", Arrays.asList("Madrid", "Barcelona", "Valencia", "Seville")));
        questions.add(new ShortAnswerQuestionSeed("What is the artist name of the singer Beyoncé Giselle Knowles-Carter?", "Beyoncé"));
        questions.add(new MultipleChoiceQuestionSeed("What is the capital of the United Kingdom?", "London", Arrays.asList("London", "Birmingham", "Manchester", "Liverpool")));
        questions.add(new ShortAnswerQuestionSeed("What is the artist name of the singer Stefani Germanotta?", "Lady Gaga"));
        questions.add(new MultipleChoiceQuestionSeed("What is the capital of the United States?", "Washington, D.C.", Arrays.asList("Washington, D.C.", "New York City", "Los Angeles", "Chicago")));
        questions.add(new ShortAnswerQuestionSeed("What is the artist name of the singer Abel Makkonen Tesfaye?", "The Weeknd"));

        return new QuizSeed(questions);
    }
}