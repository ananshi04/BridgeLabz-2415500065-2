// Question: Calculate bonus and new salary for Zara employees

import java.util.Random;

public class ZaraBonusCalculator {

    public static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] data = new double[10][2];  // [salary, years of service]
        for (int i = 0; i < 10; i++) {
            data[i][0] = random.nextInt(90000) + 10000;  // 5-digit salary
            data[i][1] = random.nextInt(11);            // Years of service: 0 to 10
        }
        return data;
    }

    public static double[][] calculateNewSalariesAndBonuses(double[][] oldData) {
        double[][] newData = new double[10][3];  // [oldSalary, yearsOfService, newSalary]

        for (int i = 0; i < 10; i++) {
            double oldSalary = oldData[i][0];
            double yearsOfService = oldData[i][1];
            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;

            newData[i][0] = oldSalary;
            newData[i][1] = yearsOfService;
            newData[i][2] = newSalary;
        }

        return newData;
    }

    public static void displayBonuses(double[][] data) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Old Salary\tYears of Service\tNew Salary\tBonus");
        for (double[] record : data) {
            double oldSalary = record[0];
            double yearsOfService = record[1];
            double newSalary = record[2];
            double bonus = newSalary - oldSalary;

            System.out.printf("%.2f\t\t%.0f\t\t\t%.2f\t\t%.2f%n", oldSalary, yearsOfService, newSalary, bonus);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.printf("\nTotal Old Salary: %.2f\nTotal Bonus Paid: %.2f\nTotal New Salary: %.2f%n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        double[][] oldData = generateEmployeeData();
        double[][] updatedData = calculateNewSalariesAndBonuses(oldData);
        displayBonuses(updatedData);
    }
}
