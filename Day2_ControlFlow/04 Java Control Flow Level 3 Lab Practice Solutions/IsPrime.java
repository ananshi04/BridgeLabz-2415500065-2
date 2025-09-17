//Write a Program to check if the given number is a prime number or not
import java.util.Scanner;
class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 1) {
            System.out.println(n + " is not prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) { isPrime = false; break; }
            }
            System.out.println(n + (isPrime ? " is prime" : " is not prime"));
        }
        input.close();
    }
}
