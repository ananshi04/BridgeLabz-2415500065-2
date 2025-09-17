//Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
import java.util.Scanner;
class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean valid = year >= 1582;
        boolean isLeap = valid && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        if (!valid) System.out.println("Year should be >= 1582");
        else System.out.println(year + (isLeap ? " is a Leap Year" : " is not a Leap Year"));
        input.close();
    }
}
