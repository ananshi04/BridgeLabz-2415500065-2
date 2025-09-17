// Question: Find the maximum number of handshakes among students

import java.util.Scanner;

public class MaximumHandshakes {
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Students:");
        int students = scanner.nextInt();

        System.out.println("Maximum Handshakes: " + calculateHandshakes(students));

        scanner.close();
    }
}
