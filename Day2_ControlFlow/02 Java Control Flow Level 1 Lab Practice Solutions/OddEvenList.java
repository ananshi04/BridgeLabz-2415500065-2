//Create a program to print odd and even numbers between 1 to the number entered by the user.
import java.util.Scanner;
class OddEvenList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) System.out.println("Enter a natural number");
        else {
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " is " + ((i % 2 == 0) ? "even" : "odd"));
            }
        }
        input.close();
    }
}
