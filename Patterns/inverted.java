package Patterns;

public class inverted {
    public static void main(String[] args) {
        int n = 5;
        // Print inverted star pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
