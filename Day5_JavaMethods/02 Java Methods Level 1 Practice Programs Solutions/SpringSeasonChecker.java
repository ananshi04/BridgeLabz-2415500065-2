// Question: SpringSeason program to check if it's spring season

import java.util.Scanner;

public class SpringSeasonChecker {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month and day:");
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println(isSpringSeason(month, day) ? "It's Spring Season" : "Not Spring Season");

        scanner.close();
    }
}
