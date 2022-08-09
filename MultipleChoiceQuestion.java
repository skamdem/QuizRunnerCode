import java.util.ArrayList;

/**
 * Created by kamdem
 */
public class MultipleChoiceQuestion extends CheckBoxQuestion{
    public MultipleChoiceQuestion(String questionString,
                                  ArrayList<String> setOfPossibleAnswers,
                                  ArrayList<String> sublistOfCorrectAnswers){
        super(questionString, setOfPossibleAnswers, sublistOfCorrectAnswers);

        //Enforce that a MultipleChoiceQuestion has ONE correct answer
        assert (this.getSublistOfCorrectAnswers().size()==1);
    }

    public MultipleChoiceQuestion(String questionString,
                                  ArrayList<String> setOfPossibleAnswers,
                                  String answer){
        super(questionString, setOfPossibleAnswers, new ArrayList<>());
        this.setCorrectAnswer(answer);
    }

    public String getCorrectAnswers() {
        return this.getSublistOfCorrectAnswers().get(0);
    }
    public void setCorrectAnswer(String answer)    {
        ArrayList<String> temp = new ArrayList<>();
        temp.add(answer);
        this.setSublistOfCorrectAnswers(temp);
    }
}
