// Question: Check if 3 points are collinear using slope and area formula

import java.util.Scanner;

public class CollinearPointsChecker {

    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1, y1:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter x2, y2:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Enter x3, y3:");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        boolean slopeCollinear = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCollinear = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by Slope Formula: " + slopeCollinear);
        System.out.println("Collinear by Area Formula: " + areaCollinear);

        scanner.close();
    }
}
