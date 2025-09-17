//Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
import java.util.Scanner;
class SumCompareFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number");
        } else {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) sumFor += i;
            int sumFormula = n * (n + 1) / 2;
            System.out.println("For sum = " + sumFor + ", Formula sum = " + sumFormula);
            System.out.println("Both equal? " + (sumFor == sumFormula));
        }
        input.close();
    }
}
