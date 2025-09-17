//Create a program to count the number of digits in an integer.
import java.util.Scanner;
class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = Math.abs(input.nextLong());
        if (n == 0) System.out.println("Number of digits = 1");
        else {
            int count = 0;
            while (n > 0) { n /= 10; count++; }
            System.out.println("Number of digits = " + count);
        }
        input.close();
    }
}
