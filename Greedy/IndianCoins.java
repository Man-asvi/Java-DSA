package Greedy;
import java.util.ArrayList;

public class IndianCoins {

    public static void main(String[] args) {
        int coins[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 1059;

        int count = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++) {
            if(coins[i] <= amount) {
                while(coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println(count);
        System.out.println(ans);

    }
    
}
