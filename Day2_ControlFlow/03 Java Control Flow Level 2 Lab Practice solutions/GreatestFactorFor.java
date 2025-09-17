// Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
import java.util.Scanner;
class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor besides itself: " + greatestFactor);
        input.close();
    }
}
