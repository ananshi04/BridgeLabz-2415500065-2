// Question: Calculate how many rounds the athlete must complete for 5 km

import java.util.Scanner;

public class AthleteRunRounds {
    public static int computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) (5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three sides of triangular park:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.println("Rounds for 5km run: " + computeRounds(side1, side2, side3));

        scanner.close();
    }
}
