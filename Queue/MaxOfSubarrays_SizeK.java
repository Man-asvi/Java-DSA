package Queue;
import java.util.Deque;
import java.util.LinkedList;

public class MaxOfSubarrays_SizeK {
    static void printMax(int arr[], int n, int k) {
        Deque<Integer> Qi = new LinkedList<>();

        int i;

        // Process first k elements
        for (i = 0; i < k; ++i) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        // Process the rest of the elements
        for (; i < n; ++i) {
            // Print the maximum of the previous window
            System.out.print(arr[Qi.peek()] + " ");

            // Remove elements outside the current window
            while (!Qi.isEmpty() && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            // Remove all elements smaller than the currently being added element
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            // Add current element at the back of the deque
            Qi.addLast(i);
        }

        // Print the maximum for the last window
        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        printMax(arr, arr.length, k);
    }
    
}
