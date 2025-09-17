//Create a program to find the BMI of a person
import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weightKg = input.nextDouble();
        double heightCm = input.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        System.out.printf("BMI = %.2f, Status = %s%n", bmi, status);
        input.close();
    }
}
