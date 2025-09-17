//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
import java.util.Scanner;
class FriendsYoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ages: Amar, Akbar, Anthony
        int ageA = input.nextInt(); // Amar age
        int ageB = input.nextInt(); // Akbar age
        int ageC = input.nextInt(); // Anthony age
        // heights:
        double hA = input.nextDouble();
        double hB = input.nextDouble();
        double hC = input.nextDouble();
        // youngest
        if (ageA <= ageB && ageA <= ageC) System.out.println("Youngest: Amar");
        else if (ageB <= ageA && ageB <= ageC) System.out.println("Youngest: Akbar");
        else System.out.println("Youngest: Anthony");
        // tallest
        if (hA >= hB && hA >= hC) System.out.println("Tallest: Amar");
        else if (hB >= hA && hB >= hC) System.out.println("Tallest: Akbar");
        else System.out.println("Tallest: Anthony");
        input.close();
    }
}
