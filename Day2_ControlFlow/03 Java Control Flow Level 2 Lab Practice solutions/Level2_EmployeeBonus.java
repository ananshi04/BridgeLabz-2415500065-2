// Create a program to find the bonuses of employees based on their years of service.
import java.util.Scanner;
class Level2_EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();
        double bonus = (years > 5) ? salary * 0.05 : 0.0;
        System.out.println("Bonus = " + bonus);
        input.close();
    }
}
