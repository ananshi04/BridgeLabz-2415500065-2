// Question: Find the sum of n natural numbers using recursion and formula, then compare

import java.util.Scanner;

public class NaturalNumberSumComparison {

    public static int sumUsingRecursion(int n) {
        if (n <= 1) return n;
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        int n = scanner.nextInt();

        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula: " + formulaSum);
        System.out.println(recursiveSum == formulaSum ? "Results match." : "Results do not match.");

        scanner.close();
    }
}
