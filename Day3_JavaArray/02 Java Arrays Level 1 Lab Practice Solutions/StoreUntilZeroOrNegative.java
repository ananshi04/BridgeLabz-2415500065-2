import java.util.Scanner;
public class StoreUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int idx = 0;
        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double v = sc.nextDouble();
            if (v <= 0) break;
            if (idx == 10) {
                System.out.println("Array limit reached (10).");
                break;
            }
            arr[idx++] = v;
        }
        double sum = 0;
        System.out.println("Numbers entered:");
        for (int i=0;i<idx;i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
