import java.util.Scanner;
import java.util.Arrays;
public class Copy2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements row-wise:");
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) mat[i][j] = sc.nextInt();
        int[] arr = new int[r*c];
        int k=0;
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) arr[k++] = mat[i][j];
        System.out.println("1D array: " + Arrays.toString(arr));
        sc.close();
    }
}
