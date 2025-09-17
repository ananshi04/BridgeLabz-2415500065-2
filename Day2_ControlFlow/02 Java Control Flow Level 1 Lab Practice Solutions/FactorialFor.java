// Rewrite program 14 using for loop
import java.util.Scanner;
class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) System.out.println("Factorial not defined for negative numbers");
        else {
            long fact = 1;
            for (int i = 2; i <= n; i++) fact *= i;
            System.out.println(n + "! = " + fact);
        }
        input.close();
    }
}
