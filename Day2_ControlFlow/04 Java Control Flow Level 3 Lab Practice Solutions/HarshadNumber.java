//Create a program to check if a number taken from the user is a Harshad Number.
import java.util.Scanner;
class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int temp = Math.abs(number);
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum == 0) System.out.println("Not a Harshad Number (sum of digits zero)");
        else System.out.println(number + (number % sum == 0 ? " is a Harshad Number" : " is not a Harshad Number"));
        input.close();
    }
}
