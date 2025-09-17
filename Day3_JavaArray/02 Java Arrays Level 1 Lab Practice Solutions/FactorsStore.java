import java.util.Scanner;
import java.util.Arrays;
public class FactorsStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) { System.err.println("Invalid number."); sc.close(); return; }
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int idx = 0;
        for (int i=1;i<=n;i++) {
            if (n % i == 0) {
                if (idx == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[idx++] = i;
            }
        }
        System.out.println("Factors: " + Arrays.toString(Arrays.copyOf(factors, idx)));
        sc.close();
    }
}
