package Sort;

public class Counting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int max = findMax(arr);
        countingSort(arr, max);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void countingSort(int[] arr, int max) {
        int n = arr.length;
        int[] count = new int[max + 1];
        int[] output = new int[n];

        // Count occurrences of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Update count[i] to contain the actual position of this element in output[]
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers
        System.arraycopy(output, 0, arr, 0, n);
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
}
