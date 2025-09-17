import java.util.Scanner;
import java.util.Locale;
public class BMIList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i=0;i<n;i++) {
            System.out.print("Enter height (m) for person " + (i+1) + ": ");
            height[i] = sc.nextDouble();
            if (height[i] <= 0) { System.err.println("Invalid height"); i--; continue; }
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            if (weight[i] <= 0) { System.err.println("Invalid weight"); i--; continue; }
            bmi[i] = weight[i] / (height[i]*height[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\tStatus");
        for (int i=0;i<n;i++) System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", i+1, height[i], weight[i], bmi[i], status[i]);
        sc.close();
    }
}
