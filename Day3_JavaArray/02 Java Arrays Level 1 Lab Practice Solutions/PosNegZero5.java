import java.util.Scanner;
public class PosNegZero5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++){
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int v: arr){
            if (v>0) {
                System.out.print(v + " is positive");
                if (v%2==0) System.out.println(" and even.");
                else System.out.println(" and odd.");
            } else if (v<0) System.out.println(v + " is negative.");
            else System.out.println("0 is zero.");
        }
        int first = arr[0], last = arr[arr.length-1];
        if (first == last) System.out.println("First and last are equal.");
        else if (first > last) System.out.println("First is greater than last.");
        else System.out.println("First is less than last.");
        sc.close();
    }
}
