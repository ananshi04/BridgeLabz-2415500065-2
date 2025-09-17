//Write a program to create a calculator using switch...case.
import java.util.Scanner;
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();
        double result;
        switch (op) {
            case "+":
                result = first + second; break;
            case "-":
                result = first - second; break;
            case "*":
                result = first * second; break;
            case "/":
                if (second == 0) { System.out.println("Division by zero"); input.close(); return; }
                result = first / second; break;
            default:
                System.out.println("Invalid Operator"); input.close(); return;
        }
        System.out.println("Result = " + result);
        input.close();
    }
}
