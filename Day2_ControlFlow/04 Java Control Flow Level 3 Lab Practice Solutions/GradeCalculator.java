//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();
        double average = (physics + chemistry + maths) / 3.0;
        String grade, remarks;
        if (average >= 90) { grade = "A"; remarks = "Excellent"; }
        else if (average >= 75) { grade = "B"; remarks = "Very Good"; }
        else if (average >= 60) { grade = "C"; remarks = "Good"; }
        else if (average >= 45) { grade = "D"; remarks = "Average"; }
        else { grade = "F"; remarks = "Fail"; }
        System.out.printf("Average = %.2f, Grade = %s, Remarks = %s%n", average, grade, remarks);
        input.close();
    }
}
