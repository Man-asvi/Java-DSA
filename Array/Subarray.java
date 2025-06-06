package Array;

public class Subarray {
    public static void main(String[] args) {
        // all subarrays of an array
        int[] arr = {1, 2, 3, 4};
        printAllSubarrays(arr);
    }
    
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
