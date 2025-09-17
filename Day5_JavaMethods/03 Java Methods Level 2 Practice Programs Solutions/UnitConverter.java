// Question: Unit conversion utility class with multiple conversions

import java.util.Scanner;

public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter Program");
        System.out.println("Select Conversion:");
        System.out.println("1. Km to Miles");
        System.out.println("2. Miles to Km");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.println("5. Yards to Feet");
        System.out.println("6. Feet to Yards");
        System.out.println("7. Meters to Inches");
        System.out.println("8. Inches to Meters");
        System.out.println("9. Inches to Centimeters");
        System.out.println("10. Fahrenheit to Celsius");
        System.out.println("11. Celsius to Fahrenheit");
        System.out.println("12. Pounds to Kilograms");
        System.out.println("13. Kilograms to Pounds");
        System.out.println("14. Gallons to Liters");
        System.out.println("15. Liters to Gallons");

        int choice = scanner.nextInt();
        System.out.println("Enter value:");
        double value = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1 -> result = convertKmToMiles(value);
            case 2 -> result = convertMilesToKm(value);
            case 3 -> result = convertMetersToFeet(value);
            case 4 -> result = convertFeetToMeters(value);
            case 5 -> result = convertYardsToFeet(value);
            case 6 -> result = convertFeetToYards(value);
            case 7 -> result = convertMetersToInches(value);
            case 8 -> result = convertInchesToMeters(value);
            case 9 -> result = convertInchesToCentimeters(value);
            case 10 -> result = convertFahrenheitToCelsius(value);
            case 11 -> result = convertCelsiusToFahrenheit(value);
            case 12 -> result = convertPoundsToKilograms(value);
            case 13 -> result = convertKilogramsToPounds(value);
            case 14 -> result = convertGallonsToLiters(value);
            case 15 -> result = convertLitersToGallons(value);
            default -> System.out.println("Invalid choice.");
        }

        if (choice >= 1 && choice <= 15)
            System.out.printf("Converted value: %.4f%n", result);

        scanner.close();
    }
}
