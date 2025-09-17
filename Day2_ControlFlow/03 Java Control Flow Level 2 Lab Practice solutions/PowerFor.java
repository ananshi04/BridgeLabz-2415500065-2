//Create a program to find the power of a number.
import java.util.Scanner;
class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        if (power < 0) System.out.println("This program expects non-negative power");
        else {
            long result = 1;
            for (int i = 0; i < power; i++) result *= number;
            System.out.println(number + "^" + power + " = " + result);
        }
        input.close();
    }
}
