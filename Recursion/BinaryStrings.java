package Recursion;

public class BinaryStrings {
    public static void main(String[] args) {
        int n = 3; 
        generateBinaryStrings(n, "");
    }

    public static void generateBinaryStrings(int n, String current) {
        // without consecutive 1s
        if (n == 0) {
            System.out.println(current);
            return;
        }
        generateBinaryStrings(n - 1, current + "0");
        if (current.isEmpty() || current.charAt(current.length() - 1) != '1') {
            generateBinaryStrings(n - 1, current + "1");
        }
    }
    
}
