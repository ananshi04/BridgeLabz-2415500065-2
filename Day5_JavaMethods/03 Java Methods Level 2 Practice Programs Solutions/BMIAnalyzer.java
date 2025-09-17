// Question: Calculate BMI and display status for 10 team members

import java.util.Scanner;

public class BMIAnalyzer {

    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100;
        return weight / (heightMeters * heightMeters);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] data = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (kg) and height (cm) for person %d:%n", i + 1);
            double weight = scanner.nextDouble();
            double height = scanner.nextDouble();
            double bmi = calculateBMI(weight, height);

            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
        }

        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f\t\t%.1f\t\t%.2f\t\t%s%n",
                    data[i][0], data[i][1], data[i][2], getBMIStatus(data[i][2]));
        }

        scanner.close();
    }
}
