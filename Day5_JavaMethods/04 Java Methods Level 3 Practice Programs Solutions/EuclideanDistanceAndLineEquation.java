// Question: Calculate Euclidean distance and equation of line between two points

import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1, y1:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter x2, y2:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);
        double[] equation = calculateLineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance: %.2f%n", distance);
        System.out.printf("Equation of line: y = %.2fx + %.2f%n", equation[0], equation[1]);

        scanner.close();
    }
}
