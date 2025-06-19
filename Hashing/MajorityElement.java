package Hashing;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            // if(freq.containsKey(nums[i])) {
            //     freq.put(nums[i], freq.get(nums[i])+1);
            // } else {
            //     freq.put(nums[i], 1);
            // }

            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer key : freq.keySet()) {
            if(freq.get(key) >= nums.length/3) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }
}
