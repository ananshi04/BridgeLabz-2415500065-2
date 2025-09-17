import java.util.Scanner;
public class Mult6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int[] results = new int[4];
        int k = 0;
        for (int i=6;i<=9;i++) results[k++] = n * i;
        k = 0;
        for (int i=6;i<=9;i++) System.out.println(n + " * " + i + " = " + results[k++]);
        sc.close();
    }
}
