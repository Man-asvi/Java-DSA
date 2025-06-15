package Greedy;

public class BuySellStock {

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int n = prices.length;
        
        int buy = prices[0], max_profit = 0;

        for (int i = 1; i < n; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else {
                if (prices[i] - buy > max_profit) {
                    max_profit = prices[i] - buy;
                }
            }
        }
        
        System.out.println(max_profit);
    }
    
}
