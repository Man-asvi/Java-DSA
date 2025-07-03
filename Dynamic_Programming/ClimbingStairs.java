package Dynamic_Programming;

import java.util.Arrays;

public class ClimbingStairs { //same as fibonacci

    public static int countWays_recursion(int n) { //O(2^n)
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        return countWays_recursion(n - 1) + countWays_recursion(n - 2);
    }

    public static int countWays_memoization(int n, int ways[]) { //O(n)
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }

        if(ways[n] != -1) {
            return ways[n];
        }

        ways[n] = countWays_memoization(n - 1, ways) + countWays_memoization(n - 2, ways);
        return ways[n];
    }

    public static int countWays_tabulation(int n) { //O(n)
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for(int i=1; i<=n; i++) {
            if(i == 1) {
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);

        System.out.println(countWays_recursion(n));
        System.out.println(countWays_memoization(n, ways));
        System.out.println(countWays_tabulation(n));
    }
}