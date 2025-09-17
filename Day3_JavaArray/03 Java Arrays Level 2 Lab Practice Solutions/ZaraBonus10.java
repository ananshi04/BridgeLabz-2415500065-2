import java.util.Scanner;
import java.util.Locale;
public class ZaraBonus10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        final int N = 10;
        double[] salary = new double[N];
        double[] years = new double[N];
        double[] bonus = new double[N];
        double[] newSalary = new double[N];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i=0;i<N;i++) {
            System.out.print("Enter salary for employee " + (i+1) + ": ");
            double s = sc.nextDouble();
            if (s < 0) { System.err.println("Invalid salary, enter again."); i--; continue; }
            System.out.print("Enter years of service for employee " + (i+1) + ": ");
            double y = sc.nextDouble();
            if (y < 0) { System.err.println("Invalid years, enter again."); i--; continue; }
            salary[i] = s; years[i] = y;
        }
        for (int i=0;i<N;i++) {
            double pct = years[i] > 5 ? 0.05 : 0.02;
            bonus[i] = salary[i] * pct;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }
        System.out.println("Employee\tOldSalary\tYears\tBonus\tNewSalary");
        for (int i=0;i<N;i++) {
            System.out.printf("%d\t\t%.2f\t\t%.1f\t%.2f\t%.2f\n", i+1, salary[i], years[i], bonus[i], newSalary[i]);
        }
        System.out.printf("Total old salary: %.2f\nTotal bonus payout: %.2f\nTotal new salary: %.2f\n", totalOld, totalBonus, totalNew);
        sc.close();
    }
}
