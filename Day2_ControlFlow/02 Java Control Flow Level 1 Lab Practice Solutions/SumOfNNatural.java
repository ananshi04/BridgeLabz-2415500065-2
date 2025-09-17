/*
Q4. Write a Java program to calculate the sum of n natural numbers. 
Also check whether the entered number is a natural number or not.
*/
import java.util.Scanner;
class SumOfNNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 1) {
            long sum = (long)n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        input.close();
    }
}
