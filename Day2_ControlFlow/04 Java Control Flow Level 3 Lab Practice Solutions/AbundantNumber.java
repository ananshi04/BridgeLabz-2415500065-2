//Create a program to check if a number is an Abundant Number.
import java.util.Scanner;
class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) System.out.println("Enter a positive integer");
        else {
            int sum = 0;
            for (int i = 1; i < number; i++) if (number % i == 0) sum += i;
            System.out.println(number + (sum > number ? " is an Abundant Number" : " is not an Abundant Number"));
        }
        input.close();
    }
}
