//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
import java.util.Scanner;
class SumCompareWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number");
        } else {
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("While sum = " + sumWhile + ", Formula sum = " + sumFormula);
            System.out.println("Both equal? " + (sumWhile == sumFormula));
        }
        input.close();
    }
}
