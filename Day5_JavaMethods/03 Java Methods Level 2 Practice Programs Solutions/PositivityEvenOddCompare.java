// Question: Check positivity, even/odd, and compare first and last of 5 numbers

import java.util.Scanner;

public class PositivityEvenOddCompare {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) numbers[i] = scanner.nextInt();

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.println(num + " is Positive and " + (isEven(num) ? "Even" : "Odd"));
            } else {
                System.out.println(num + " is Negative");
            }
        }

        int comparison = compare(numbers[0], numbers[4]);
        String result = comparison > 0 ? "greater than" : comparison < 0 ? "less than" : "equal to";
        System.out.printf("First element is %s the last element.%n", result);

        scanner.close();
    }
}
