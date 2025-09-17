//7.	Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
import java.util.Scanner;
class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt(); // 1..12
        int day = input.nextInt();   // 1..31
        boolean isSpring = false;
        if (month == 3 && day >= 20) isSpring = true;
        else if (month > 3 && month < 6) isSpring = true;
        else if (month == 6 && day <= 20) isSpring = true;
        System.out.println(isSpring ? "Its a Spring Season" : "Not a Spring Season");
        input.close();
    }
}
