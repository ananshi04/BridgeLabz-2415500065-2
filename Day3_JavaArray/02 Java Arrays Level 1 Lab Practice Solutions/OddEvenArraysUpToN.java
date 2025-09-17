import java.util.Scanner;
import java.util.Arrays;
public class OddEvenArraysUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.err.println("Invalid input: must be a natural number >=1");
            sc.close(); return;
        }
        int maxEven = n/2 + 1;
        int maxOdd = n/2 + 1;
        int[] evens = new int[maxEven];
        int[] odds = new int[maxOdd];
        int ei=0, oi=0;
        for (int i=1;i<=n;i++) {
            if (i%2==0) evens[ei++] = i;
            else odds[oi++] = i;
        }
        System.out.println("Evens: " + Arrays.toString(Arrays.copyOf(evens, ei)));
        System.out.println("Odds: " + Arrays.toString(Arrays.copyOf(odds, oi)));
        sc.close();
    }
}
