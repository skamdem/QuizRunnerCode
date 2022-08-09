import java.util.ArrayList;

/**
 * Created by kamdem
 */
public class TrueFalseQuestion extends CheckBoxQuestion {
    static final String TRUE = "TRUE";
    static final String FALSE = "FALSE";

    public TrueFalseQuestion(String questionString, boolean answer) {
        super(questionString, new ArrayList<String>(), new ArrayList<String>());
        String correctAnswer = answer ? TRUE : FALSE;
        this.setCorrectAnswer(correctAnswer);

        ArrayList<String> temp = new ArrayList<>();
        temp.add(TRUE);
        temp.add(FALSE);
        this.setSetOfPossibleAnswers(temp);
    }

    public String getCorrectAnswers() {
        return this.getSublistOfCorrectAnswers()
                .get(0);
    }

    public void setCorrectAnswer(String answer) {
        ArrayList<String> temp = new ArrayList<>();
        temp.add(answer);
        this.setSublistOfCorrectAnswers(temp);
    }
}
