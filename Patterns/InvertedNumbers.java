package Patterns;

public class InvertedNumbers {
    public static void main(String[] args) {
        int n = 5; // You can change this value to generate a different size pattern

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
