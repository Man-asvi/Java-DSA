package Dynamic_Programming;

public class RodCutting { // same as unbounded knapsack
    public static int rodCutting(int length[], int price[], int rod) { //O(n * w)
        int n = length.length;
        int dp[][] = new int[n + 1][rod + 1];
        for(int i=0; i<dp.length; i++) {
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=rod; j++) {
                if(length[i-1] <= j) {
                    int incProfit = price[i-1] + dp[i][j-length[i-1]];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][rod];
    }

    public static void main(String[] args) {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int rod = 8;

        System.out.println(rodCutting(length, price, rod));
    }
}
