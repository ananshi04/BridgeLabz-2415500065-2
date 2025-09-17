// Question: Find the sum of n natural numbers using loop

import java.util.Scanner;

public class NaturalNumbersSum {
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        System.out.println("Sum of natural numbers: " + sumNaturalNumbers(n));

        scanner.close();
    }
}
