// Question: Check whether a year is a Leap Year or not

import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");

        scanner.close();
    }
}
