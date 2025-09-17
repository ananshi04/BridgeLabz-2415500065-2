import java.util.Scanner;
public class VoteCheck10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i+1) + ": ");
            int a = sc.nextInt();
            if (a < 0) {
                System.err.println("Invalid age. Please enter a non-negative age.");
                i--; continue;
            }
            ages[i] = a;
        }
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) System.out.println("Student with age " + ages[i] + " can vote.");
            else System.out.println("Student with age " + ages[i] + " cannot vote.");
        }
        sc.close();
    }
}
