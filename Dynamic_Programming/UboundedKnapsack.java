package Dynamic_Programming;

public class UboundedKnapsack {

    public static int knapsack(int val[], int wt[], int w) { //O(n * w)
        int n = val.length;
        int dp[][] = new int[n + 1][w + 1];
        for(int i=0; i<dp.length; i++) {
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<w+1; j++) {
                int v = val[i - 1];
                int W = wt[i - 1];
                if(W <= j) {
                    int incProfit = v + dp[i][j-W];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        return dp[n][w];
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int w = 7;

        System.out.println(knapsack(val, wt, w));
    }
    
}
