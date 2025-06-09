package ArrayList;
import java.util.ArrayList;

public class PairSum2 {

    public static boolean pairSumSortedRotated(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // Find the pivot (smallest element's index)
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get((i + 1) % n)) {
                pivot = i;
                break;
            }
        }

        int left = (pivot + 1) % n; // Smallest element
        int right = pivot;          // Largest element

        while (left != right) {
            int currentSum = list.get(left) + list.get(right);

            if (currentSum == target) {
                System.out.println("Pair found: " + list.get(left) + ", " + list.get(right));
                return true;
            }

            if (currentSum < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;  // Circular decrement
            }
        }

        System.out.println("No pair found.");
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int targetSum = 16;

        System.out.println("Using circular two-pointer method:");
        pairSumSortedRotated(list, targetSum);
    }
}