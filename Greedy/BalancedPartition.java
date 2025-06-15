package Greedy;

public class BalancedPartition {

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n = str.length();

        if (n == 0) {
            System.out.println(0);
        }
            
        int r = 0, l = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }

            if (r == l) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}