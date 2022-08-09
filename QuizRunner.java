import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kamdem
 */
public class QuizRunner {
    public static List<Question> quizQuestions;
    public static ArrayList<String> tempList = new ArrayList<>();
    public static ArrayList<String> tempListAnswer = new ArrayList<>();
    public static int score = 0;

    public static boolean checkEquals(ArrayList<String> l1, ArrayList<String> l2){
        if (l1.size() != l2.size()) return false;
        for (String s : l1){
            if (!(l2.contains(s))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        quizQuestions = new ArrayList<>();
        Question tf1 = new TrueFalseQuestion("Georges Washington was the US first president", true);

        tempList.addAll(Arrays.asList("22", "24", "20"));
        Question mc1 = new MultipleChoiceQuestion("Number of hours in a day?", tempList, "24");
        tempList.clear();

        tempList.addAll(Arrays.asList("60", "51", "50", "fifty"));
        tempListAnswer.addAll(Arrays.asList("fifty", "50"));
        Question cq1 = new CheckBoxQuestion("Number of states in the US?", tempList, tempListAnswer);

        tempList.clear();
        tempListAnswer.clear();

        quizQuestions.add(tf1);
        quizQuestions.add(mc1);
        quizQuestions.add(cq1);

        Scanner sc = new Scanner(System.in);
        String input;

        for (Question q : quizQuestions) {
            q.printQuestion();
            if ((q instanceof CheckBoxQuestion) && !(q instanceof TrueFalseQuestion) && !(q instanceof MultipleChoiceQuestion)) {
                System.out.println("Enter the different choices on separate lines and finally type 'Z' to terminate the list");
                input = sc.nextLine();
                ArrayList<String> tempL = new ArrayList<>();
                while (!input.equals("Z")) {
                    tempL.add(input);
                    input = sc.nextLine();
                }
                if (checkEquals(tempL, q.getSublistOfCorrectAnswers())) {
                    score++;
                    System.out.println("GOOD");
                }
            } else {// (statement) ? get this : get that
                input = sc.nextLine();
                input = (input.toUpperCase()
                        .equals("TRUE") || (input.toUpperCase()
                        .equals("FALSE"))) ? input.toUpperCase() : input;
                if (input.equals(q.getSublistOfCorrectAnswers()
                        .get(0))) {
                    score++;
                    System.out.println("GOOD");
                }
            }

        }
        System.out.println("You score is: " + score + "/" + quizQuestions.size());
    }
}
