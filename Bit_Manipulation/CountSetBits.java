package Bit_Manipulation;

public class CountSetBits {
    public static void main(String[] args) {
        int number = 29; // Example number
        System.out.println("Number of set bits in " + number + ": " + countSetBits(number));
    }
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); // Increment count if the last bit is set
            n >>= 1; // Right shift to process the next bit
        }
        return count;
    }
}
