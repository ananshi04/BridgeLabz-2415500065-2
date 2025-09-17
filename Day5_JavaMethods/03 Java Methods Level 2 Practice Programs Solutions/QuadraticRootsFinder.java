// Question: Find roots of quadratic equation

import java.util.Scanner;

public class QuadraticRootsFinder {

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[]{};  // No real roots

        if (delta == 0) return new double[]{-b / (2 * a)};
        return new double[]{
                (-b + Math.sqrt(delta)) / (2 * a),
                (-b - Math.sqrt(delta)) / (2 * a)
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) System.out.println("No real roots.");
        else {
            System.out.print("Roots: ");
            for (double root : roots) System.out.print(root + " ");
            System.out.println();
        }

        scanner.close();
    }
}
