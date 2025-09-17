//Write a program to find the sum of numbers until the user enters 0
import java.util.Scanner;
class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double val;
        while ((val = input.nextDouble()) != 0.0) {
            total += val;
        }
        System.out.println("Total = " + total);
        input.close();
    }
}
