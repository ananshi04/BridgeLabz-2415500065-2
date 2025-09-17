// Question: Find shortest, tallest, and mean height of players in a football team

import java.util.Random;

public class FootballTeamHeightStats {

    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(101) + 150; // 150 to 250 cm
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) sum += height;
        return sum;
    }

    public static double calculateMean(int[] heights) {
        return sumHeights(heights) / (double) heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) min = Math.min(min, height);
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) max = Math.max(max, height);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();

        System.out.printf("Mean Height: %.2f cm%n", calculateMean(heights));
        System.out.println("Shortest Player Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Player Height: " + findTallest(heights) + " cm");
    }
}
