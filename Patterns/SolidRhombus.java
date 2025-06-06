package Patterns;

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5; // Size of the rhombus

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
    
}
