//Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
import java.util.Scanner;
class IsArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = number;
        int sum = 0;
        // compute number of digits
        int digits = String.valueOf(Math.abs(number)).length();
        while (temp != 0) {
            int d = Math.abs(temp % 10);
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        System.out.println(number + (sum == number ? " is an Armstrong number" : " is not an Armstrong number"));
        input.close();
    }
}
