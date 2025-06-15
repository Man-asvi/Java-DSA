package Greedy;

public class KSubArray {

    public static int ans;

    public static void solve(int a[], int n, int k, int index, int currMax) {
        if (k == 1) {
            int sum = 0;
            for (int i = index; i < n; i++) {
                sum += a[i];
            }
            currMax = Math.max(currMax, sum);
            ans = Math.min(ans, currMax);
            return;
        }

        int sum = 0;
        for (int i = index; i < n - (k - 1); i++) {
            sum += a[i];
            solve(a, n, k - 1, i + 1, Math.max(currMax, sum));
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 3;
        int n = arr.length;

        ans = Integer.MAX_VALUE;
        solve(arr, n, k, 0, 0);
        System.out.println(ans);
        
    }
    
}
