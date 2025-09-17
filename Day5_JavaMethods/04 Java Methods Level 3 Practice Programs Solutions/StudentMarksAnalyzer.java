// Question: Generate random marks for students and calculate total, average, percentage

import java.util.Random;

public class StudentMarksAnalyzer {

    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];  // Physics, Chemistry, Maths
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(41) + 60;  // Random score between 60-100
            }
        }
        return scores;
    }

    public static double[][] calculateTotalsAveragesPercentages(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];  // total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0) * 100.0 * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%%n",
                    scores[i][0], scores[i][1], scores[i][2],
                    (int) results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateRandomScores(10);
        double[][] results = calculateTotalsAveragesPercentages(scores);
        displayScorecard(scores, results);
    }
}
