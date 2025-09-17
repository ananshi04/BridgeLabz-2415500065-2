//Rewrite the above program to find the power of a number using a while loop.
import java.util.Scanner;
class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        if (power < 0) System.out.println("This program expects non-negative power");
        else {
            long result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + "^" + power + " = " + result);
        }
        input.close();
    }
}
