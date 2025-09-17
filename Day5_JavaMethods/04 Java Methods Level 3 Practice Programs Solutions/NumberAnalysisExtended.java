// Question: Extended NumberChecker utility class for sum, square sum, Harshad, frequency

import java.util.Arrays;

public class NumberAnalysisExtended {

    public static int[] getDigitsArray(int number) {
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        return Arrays.stream(digits).sum();
    }

    public static int sumOfSquareOfDigits(int[] digits) {
        return Arrays.stream(digits).map(d -> d * d).sum();
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freqArray = new int[10][2];
        for (int i = 0; i < 10; i++) freqArray[i][0] = i;

        for (int digit : digits) freqArray[digit][1]++;

        return freqArray;
    }

    public static void main(String[] args) {
        int number = 21;
        int[] digits = getDigitsArray(number);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquareOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        System.out.println("Digit Frequencies:");
        int[][] frequencies = digitFrequency(digits);
        for (int[] pair : frequencies) {
            if (pair[1] > 0) System.out.printf("Digit %d occurs %d times%n", pair[0], pair[1]);
        }
    }
}
