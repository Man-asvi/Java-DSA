package Greedy;
import java.util.Arrays;

public class SmallestString {

    public static void main(String[] args) {
        int n = 3, k = 25;
        
        char[] arr = new char[n];
        Arrays.fill(arr, 'a'); // Fill all with 'a' initially
        k -= n; // Since 'a' is 1, total value is already n

        int i = n - 1;

        while (k > 0 && i >= 0) {
            int add = Math.min(25, k); // Max we can add is 25 to go from 'a' to 'z'
            arr[i] = (char)(arr[i] + add);
            k -= add;
            i--;
        }

        System.out.print(new String(arr));

    }
    
}
