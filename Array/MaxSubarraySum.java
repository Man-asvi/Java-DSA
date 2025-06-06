package Array;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static int findMaxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}