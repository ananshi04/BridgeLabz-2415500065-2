//Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("Year should be >= 1582 for Gregorian calendar");
        } else {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(year + (isLeap ? " is a Leap Year" : " is not a Leap Year"));
        }
        input.close();
    }
}
