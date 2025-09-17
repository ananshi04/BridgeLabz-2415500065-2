// Question: Find youngest and tallest among 3 friends

import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static int findYoungest(int[] ages) {
        return Math.min(ages[0], Math.min(ages[1], ages[2]));
    }

    public static int findTallest(int[] heights) {
        return Math.max(heights[0], Math.max(heights[1], heights[2]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter age of friend %d: ", i + 1);
            ages[i] = scanner.nextInt();
            System.out.printf("Enter height (in cm) of friend %d: ", i + 1);
            heights[i] = scanner.nextInt();
        }

        System.out.println("Youngest age: " + findYoungest(ages));
        System.out.println("Tallest height: " + findTallest(heights));

        scanner.close();
    }
}
