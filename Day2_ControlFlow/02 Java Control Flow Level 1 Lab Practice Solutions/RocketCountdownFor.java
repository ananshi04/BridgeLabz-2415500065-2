//Rewrite program 8 to do the countdown using the for-loop
import java.util.Scanner;
class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        input.close();
    }
}
