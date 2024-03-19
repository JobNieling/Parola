package nl.han.oose.dea.seeds;

import java.util.List;

public class MultipleChoiceQuestionSeed extends QuestionSeed {
    private List<String> options;

    public MultipleChoiceQuestionSeed(String question, String answer, List<String> options) {
        super(question, answer);
        this.options = options;
    }

    public List<String> getOptions() {
        return options;
    }
}