package Recursion;
import java.util.Scanner;

public class TilingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the floor: ");
        int n = sc.nextInt();
        System.out.println("Number of ways to tile a " + n + " unit long floor: " + countWays(n));
        sc.close();
    }

    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return countWays(n - 1) + countWays(n - 2);
    }
}