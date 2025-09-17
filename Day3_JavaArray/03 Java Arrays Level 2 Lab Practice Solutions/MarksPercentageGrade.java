import java.util.Scanner;
public class MarksPercentageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3]; // physics, chemistry, maths
        double[] percent = new double[n];
        char[] grade = new char[n];
        for (int i=0;i<n;i++) {
            System.out.println("Student " + (i+1));
            for (int j=0;j<3;j++) {
                System.out.print("Enter marks (0-100) for subject " + (j+1) + ": ");
                int m = sc.nextInt();
                if (m < 0 || m > 100) { System.err.println("Invalid marks"); j--; continue; }
                marks[i][j] = m;
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = total / 3.0;
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 80) grade[i] = 'B';
            else if (percent[i] >= 70) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else grade[i] = 'F';
        }
        for (int i=0;i<n;i++) {
            System.out.printf("Student %d - Marks: %d, %d, %d  Percentage: %.2f  Grade: %c\n", i+1, marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }
        sc.close();
    }
}
