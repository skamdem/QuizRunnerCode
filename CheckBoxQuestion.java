import java.util.ArrayList;

/**
 * Created by kamdem
 */
public class CheckBoxQuestion extends Question {

    public CheckBoxQuestion(String questionString,
                            ArrayList<String> setOfPossibleAnswers,
                            ArrayList<String> sublistOfCorrectAnswers){
        this.setQuestionString(questionString);
        this.setSetOfPossibleAnswers(setOfPossibleAnswers);
        this.setSublistOfCorrectAnswers(sublistOfCorrectAnswers);
    }
}
