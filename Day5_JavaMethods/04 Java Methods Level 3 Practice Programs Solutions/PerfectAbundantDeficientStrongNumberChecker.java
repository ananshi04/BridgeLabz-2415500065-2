// Question: Check Perfect, Abundant, Deficient, and Strong number

public class PerfectAbundantDeficientStrongNumberChecker {

    public static int[] getFactors(int number) {
        return java.util.stream.IntStream.range(1, number).filter(i -> number % i == 0).toArray();
    }

    public static int sumOfFactors(int number) {
        return java.util.Arrays.stream(getFactors(number)).sum();
    }

    public static boolean isPerfectNumber(int number) {
        return sumOfFactors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        return sumOfFactors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        return sumOfFactors(number) < number;
    }

    public static boolean isStrongNumber(int number) {
        int sumFactorialDigits = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sumFactorialDigits += factorial(digit);
            temp /= 10;
        }
        return sumFactorialDigits == number;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int number = 6;

        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
