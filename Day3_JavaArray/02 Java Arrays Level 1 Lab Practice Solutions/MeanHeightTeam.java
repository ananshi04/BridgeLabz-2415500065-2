import java.util.Scanner;
public class MeanHeightTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        for (int i=0;i<11;i++) {
            System.out.print("Enter height for player " + (i+1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("Mean height = " + mean);
        sc.close();
    }
}
