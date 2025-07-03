package Dynamic_Programming;

public class MatrixChainMultiplication {

    public static int mcm_recursion(int arr[], int i, int j) {
        if(i == j) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcm_recursion(arr, i, k); //Ai...Ak -> arr[i-1]xarr[k]
            int cost2 = mcm_recursion(arr, k+1, j); //Ai+1...Aj -> arr[k]xarr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }

        return ans;
    }

    public static int mcm_memoization(int arr[], int i, int j, int dp[][]) { //O(n^2)
        if(i == j) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcm_memoization(arr, i, k, dp); //Ai...Ak -> arr[i-1]xarr[k]
            int cost2 = mcm_memoization(arr, k+1, j, dp); //Ai+1...Aj -> arr[k]xarr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }

        dp[i][j] = ans;
        return ans;
    }

    public static int mcm_tabulation(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        for(int i=0; i<n; i++) {
            dp[i][i] = 0;
        }

        for(int len=2; len<n; len++) {
            for(int i=1; i<=n-len; i++) {
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i; k<j; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }

        return dp[1][n-1];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;

        int dp[][] = new int[n+1][n+1];
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<n+1; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(mcm_recursion(arr, 1, n-1));
        System.out.println(mcm_memoization(arr, 1, n-1, dp));
        System.out.println(mcm_tabulation(arr));
    }
    
}
