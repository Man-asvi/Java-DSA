package Bit_Manipulation;

public class FastExponentiation {
    public static void main(String[] args) {
        int base = 5; // Example base
        int exponent = 15; // Example exponent
        System.out.println("Result of " + base + "^" + exponent + ": " + fastExponentiation(base, exponent));
    }

    public static int fastExponentiation(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) { // If the last bit of exponent is set
                result *= base; // Multiply the result by the current base
            }
            base *= base; // Square the base
            exponent >>= 1; // Right shift the exponent to process the next bit
        }
        return result;
    }
}