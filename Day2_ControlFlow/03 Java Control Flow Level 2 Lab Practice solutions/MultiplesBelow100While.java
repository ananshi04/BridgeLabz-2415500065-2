//Rewrite the program to find all the multiples of a number below 100 using while loop.
import java.util.Scanner;
class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) System.out.println("Enter a positive integer");
        else {
            int i = 1;
            while (i < 100) {
                if (i % number == 0) System.out.println(i);
                i++;
            }
        }
        input.close();
    }
}
