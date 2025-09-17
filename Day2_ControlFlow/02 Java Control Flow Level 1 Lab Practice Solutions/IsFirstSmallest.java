/*
Q2. Write a Java program to check whether the first number is the smallest among three numbers.
*/
import java.util.Scanner;
class IsFirstSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        boolean isSmallest = (n1 < n2) && (n1 < n3);
        System.out.println("Is the first number the smallest? " + isSmallest);
        input.close();
    }
}
