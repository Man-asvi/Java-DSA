package Array;

public class Pairs {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int targetSum = 5;
        findPairs(arr, targetSum);
    }

    public static void findPairs(int[] arr, int targetSum) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found with the target sum of " + targetSum);
        }
    }
    
}
