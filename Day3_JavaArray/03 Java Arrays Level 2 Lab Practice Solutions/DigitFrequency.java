import java.util.Scanner;
import java.util.Arrays;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter non-negative integer: ");
        long number = sc.nextLong();
        if (number < 0) { System.err.println("Invalid number"); sc.close(); return; }
        int[] digits;
        if (number == 0) {
            digits = new int[]{0};
        } else {
            int count = 0; long t = number;
            while (t > 0) { count++; t /= 10; }
            digits = new int[count];
            int idx = 0;
            while (number > 0) {
                digits[idx++] = (int)(number % 10);
                number /= 10;
            }
        }
        int[] freq = new int[10];
        for (int d: digits) freq[d]++;
        System.out.println("Digit frequencies:");
        for (int i=0;i<10;i++) System.out.println(i + " -> " + freq[i]);
        sc.close();
    }
}
