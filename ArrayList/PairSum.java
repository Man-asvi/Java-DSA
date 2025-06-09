package ArrayList;
import java.util.ArrayList;

public class PairSum {

    public static void bruteForce(ArrayList<Integer> list, int targetSum) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetSum) {
                    System.out.println("Pair found: " + list.get(i) + ", " + list.get(j));
                }
            }
        }
    }

    public static void twoPointer(ArrayList<Integer> list, int targetSum) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int currentSum = list.get(left) + list.get(right);
            if (currentSum == targetSum) {
                System.out.println("Pair found: " + list.get(left) + ", " + list.get(right));
                left++;
                right--;
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int targetSum = 5;

        System.out.println("Using brute force method:");
        bruteForce(list, targetSum);

        System.out.println("Using two-pointer method:");
        twoPointer(list, targetSum); 
    }
    
}
