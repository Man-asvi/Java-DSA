package Patterns;

public class FloydTriange {
    public static void main(String[] args) {
        int n = 10;
        int number = 1; // Starting number for Floyd's triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the number for the next position
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}
