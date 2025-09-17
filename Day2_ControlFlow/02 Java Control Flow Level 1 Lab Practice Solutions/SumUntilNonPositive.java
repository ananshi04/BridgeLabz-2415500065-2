//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
import java.util.Scanner;
class SumUntilNonPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double v = input.nextDouble();
            if (v <= 0) break;
            total += v;
        }
        System.out.println("Total = " + total);
        input.close();
    }
}
