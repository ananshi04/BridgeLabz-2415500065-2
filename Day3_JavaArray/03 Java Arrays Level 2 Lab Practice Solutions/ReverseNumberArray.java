import java.util.Scanner;
import java.util.Arrays;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter non-negative integer: ");
        long number = sc.nextLong();
        if (number < 0) { System.err.println("Invalid number"); sc.close(); return; }
        int count = 0;
        long temp = number;
        if (temp == 0) count = 1;
        while (temp > 0) { count++; temp /= 10; }
        int[] digits = new int[count];
        for (int i=0;i<count;i++) {
            digits[i] = (int)(number % 10);
            number /= 10;
        }
        System.out.println("Digits in original order (stored): " + Arrays.toString(digits));
        int[] reversed = new int[count];
        for (int i=0;i<count;i++) reversed[i] = digits[count-1-i];
        System.out.println("Reversed number digits: " + Arrays.toString(reversed));
        sc.close();
    }
}
