package Dynamic_Programming;

public class CatalansNumber { 

    public static int catalan_recursion(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        int ans = 0;
        for(int i=0; i<=n-1; i++) {
            ans += catalan_recursion(i) * catalan_recursion(n-i-1);
        }

        return ans;
    }

    public static int catalan_memoization(int n, int dp[]) {
        dp[0] = 1;
        dp[1] = 1;

        if (dp[n] != 0) {
            return dp[n];
        }

        int ans = 0;
        for(int i=0; i<=n-1; i++) {
            ans += catalan_memoization(i, dp) * catalan_memoization(n-i-1, dp);
        }
        dp[n] = ans;
        return dp[n];
    }

    public static int catalan_tabulation(int n) { //O(n^2)
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<n+1; i++) {
            for(int j=0; j<=i-1; j++) {
                dp[i] += dp[j] * dp[i-j-1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;

        int dp[] = new int[n + 1];

        System.out.println(catalan_recursion(n));
        System.out.println(catalan_memoization(n, dp));
        System.out.println(catalan_tabulation(n));
        
    }
    
}
