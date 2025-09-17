// Question: Calculate wind chill temperature

import java.util.Scanner;

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 13.12 + 0.6215 * temperature - 11.37 * Math.pow(windSpeed, 0.16) 
               + 0.3965 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature and wind speed:");
        double temperature = scanner.nextDouble();
        double windSpeed = scanner.nextDouble();

        System.out.println("Wind Chill: " + calculateWindChill(temperature, windSpeed));

        scanner.close();
    }
}
