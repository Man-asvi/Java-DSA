package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (visited.containsKey(diff)) {
                // Found the pair
                System.out.println(Arrays.toString(new int[] { i, visited.get(diff) }));
                return;
            }

            // Store current element and its index
            visited.put(arr[i], i);
        }

        // If no pair found
        System.out.println(Arrays.toString(new int[] { 0, 0 }));
    }
}