import java.util.ArrayList;

/**
 * Created by kamdem
 */
public abstract class Question {
    private String questionString;
    private ArrayList<String> setOfPossibleAnswers;
    private ArrayList<String> sublistOfCorrectAnswers;

    public String getQuestionString() {
        return questionString;
    }

    protected void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public ArrayList<String> getSetOfPossibleAnswers() {
        return setOfPossibleAnswers;
    }

    protected void setSetOfPossibleAnswers(ArrayList<String> setOfPossibleAnswers) {
        this.setOfPossibleAnswers = new ArrayList<>(setOfPossibleAnswers);
    }

    public ArrayList<String> getSublistOfCorrectAnswers() {
        return sublistOfCorrectAnswers;
    }

    protected void setSublistOfCorrectAnswers(ArrayList<String> sublistOfAnswers) {
        this.sublistOfCorrectAnswers = new ArrayList<>(sublistOfAnswers);
    }

    public void printQuestion() {
        System.out.println("Question: " + questionString + "\n"
                + "Possible answers: " + setOfPossibleAnswers);
    }

    public void printAnswer() {
        System.out.println("Answer to the Question: " + sublistOfCorrectAnswers);
    }
}
