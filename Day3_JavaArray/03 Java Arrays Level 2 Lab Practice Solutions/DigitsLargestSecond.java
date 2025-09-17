import java.util.Scanner;
import java.util.Arrays;
public class DigitsLargestSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        long number = sc.nextLong();
        if (number < 0) { System.err.println("Invalid number"); sc.close(); return; }
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int idx = 0;
        while (number != 0) {
            int d = (int)(number % 10);
            if (idx == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[idx++] = d;
            number /= 10;
        }
        if (idx == 0) { System.out.println("Largest: 0\nSecond largest: -"); sc.close(); return; }
        int largest = -1, second = -1;
        for (int i=0;i<idx;i++) {
            int v = digits[i];
            if (v > largest) { second = largest; largest = v; }
            else if (v > second && v != largest) second = v;
        }
        System.out.println("Digits: " + Arrays.toString(Arrays.copyOf(digits, idx)));
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + (second==-1?"N/A":second));
        sc.close();
    }
}
