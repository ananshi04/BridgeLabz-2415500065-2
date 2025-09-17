//Rewrite the above program 7 to find the factors of a number using the while loop
import java.util.Scanner;
class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) System.out.println("Enter a positive integer");
        else {
            int i = 1;
            while (i <= number) {
                if (number % i == 0) System.out.println(i);
                i++;
            }
        }
        input.close();
    }
}
