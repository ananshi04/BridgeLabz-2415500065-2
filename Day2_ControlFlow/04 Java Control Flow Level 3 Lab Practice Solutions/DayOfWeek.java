// Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
import java.util.Scanner;
class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt(); // 1..12
        int d = input.nextInt();
        int y = input.nextInt();
        // Zeller's congruence adjustment
        if (m < 3) { m += 12; y -= 1; }
        int K = y % 100;
        int J = y / 100;
        int h = (d + (13*(m + 1))/5 + K + (K/4) + (J/4) + 5*J) % 7;
        // h = 0 -> Saturday. Convert so that 0=Sunday:
        int dayOfWeek = ((h + 6) % 7);
        System.out.println(dayOfWeek); // 0=Sunday, 1=Monday, ...
        input.close();
    }
}
