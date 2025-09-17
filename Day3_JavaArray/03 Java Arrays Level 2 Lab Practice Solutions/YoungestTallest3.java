import java.util.Scanner;
public class YoungestTallest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar","Akbar","Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i=0;i<3;i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = sc.nextInt();
            if (ages[i] < 0) { System.err.println("Invalid age"); i--; continue; }
            System.out.print("Enter height (cm) for " + names[i] + ": ");
            heights[i] = sc.nextDouble();
            if (heights[i] <= 0) { System.err.println("Invalid height"); i--; continue; }
        }
        int minIdx = 0; int maxIdx = 0;
        for (int i=1;i<3;i++){
            if (ages[i] < ages[minIdx]) minIdx = i;
            if (heights[i] > heights[maxIdx]) maxIdx = i;
        }
        System.out.println("Youngest: " + names[minIdx] + " (age " + ages[minIdx] + ")");
        System.out.println("Tallest: " + names[maxIdx] + " (height " + heights[maxIdx] + ")");
        sc.close();
    }
}
