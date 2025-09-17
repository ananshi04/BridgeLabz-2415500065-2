// Question: Calculate trigonometric functions for a given angle in degrees

import java.util.Scanner;

public class TrigonometricCalculator {
    public static double[] calculateTrigFunctions(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter angle in degrees:");
        double angleDegrees = scanner.nextDouble();

        double[] results = calculateTrigFunctions(angleDegrees);
        System.out.printf("Sin: %.2f, Cos: %.2f, Tan: %.2f%n", results[0], results[1], results[2]);

        scanner.close();
    }
}
