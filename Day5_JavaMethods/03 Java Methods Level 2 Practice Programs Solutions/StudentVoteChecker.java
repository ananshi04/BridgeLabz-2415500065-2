// Question: Check if student can vote based on age

import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter age for student %d:%n", i + 1);
            ages[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean eligible = canStudentVote(ages[i]);
            System.out.printf("Student %d (Age %d): %s vote%n", i + 1, ages[i], eligible ? "Can" : "Cannot");
        }

        scanner.close();
    }
}
