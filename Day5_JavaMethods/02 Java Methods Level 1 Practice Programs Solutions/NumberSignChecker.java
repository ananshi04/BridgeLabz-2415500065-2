// Question: Check whether a number is positive, negative, or zero

import java.util.Scanner;

public class NumberSignChecker {
    public static int checkNumberSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check sign:");
        int number = scanner.nextInt();
        int sign = checkNumberSign(number);

        System.out.println("Sign: " + (sign == 1 ? "Positive" : sign == -1 ? "Negative" : "Zero"));

        scanner.close();
    }
}
