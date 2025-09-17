// Question: Display calendar for given month and year

import java.util.Scanner;

public class CalendarDisplay {

    public static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    public static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y--;
        }
        return (1 + 2*m + (3*(m+1))/5 + y + (y/4) - (y/100) + (y/400)) % 7;
    }

    public static void displayCalendar(int month, int year) {
        int firstDay = getFirstDayOfMonth(month, year);
        int numOfDays = daysInMonth[month - 1];

        if (month == 2 && isLeapYear(year)) numOfDays = 29;

        System.out.printf("\n   %s %d\n", months[month - 1], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) System.out.print("    ");

        for (int day = 1; day <= numOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month (1-12):");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();

        displayCalendar(month, year);

        scanner.close();
    }
}
