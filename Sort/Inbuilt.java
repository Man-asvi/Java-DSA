package Sort;

public class Inbuilt {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        java.util.Arrays.sort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void sort(int[] arr) {
        java.util.Arrays.sort(arr);
    }
    
}
