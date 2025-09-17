//Write a Program to find the factorial of an integer entered by the user.
import java.util.Scanner;
class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            long fact = 1;
            int t = n;
            while (t > 1) {
                fact *= t;
                t--;
            }
            System.out.println(n + "! = " + fact);
        }
        input.close();
    }
}
