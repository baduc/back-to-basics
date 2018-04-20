import com.bidi.examManager.ExamManager;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ExamManager examManager = new ExamManager();

        /*Lambda version */
        System.out.println("Highest score is  " + examManager.customCalculation(scores -> {
            Double highestScore = 0d;
            for (Double score : scores) {
                highestScore = Math.max(highestScore, score);
            }
            return highestScore;
        }));

        System.out.println("The last score is " + examManager.customCalculation(scores -> scores.get(scores.size() - 1)));

        examManager.printSorted();
        System.out.println("----------------------");
        examManager.printSelectedScore(score -> score >30);
        System.out.println("----------------------");
        examManager.printScores();
        System.out.println("----------------------");
    }

}
