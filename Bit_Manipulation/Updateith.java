package Bit_Manipulation;

public class Updateith {
    
    public static void main(String[] args) {
        int number = 5; // Example number
        int i = 1; // Example bit position
        int value = 1; // Value to set the ith bit to (0 or 1)
        System.out.println("Number before updating " + i + "th bit: " + number);
        int result = updateIthBit(number, i, value);
        System.out.println("Number after updating " + i + "th bit to " + value + ": " + result);
    }

    public static int updateIthBit(int n, int i, int value) {
        if (value == 0) {
            return n & ~(1 << i); // Clear the ith bit
        } else {
            return n | (1 << i); // Set the ith bit
        }
    }
    
}
