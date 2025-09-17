//Create a program to find the factors of a number taken as user input.
import java.util.Scanner;
class FactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) System.out.println("Enter a positive integer");
        else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) System.out.println(i);
            }
        }
        input.close();
    }
}
