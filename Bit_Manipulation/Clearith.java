package Bit_Manipulation;

public class Clearith {
    
    public static void main(String[] args) {
        int number = 5; // Example number
        int i = 2; // Example bit position
        System.out.println("Number before clearing " + i + "th bit: " + number);
        int result = clearIthBit(number, i);
        System.out.println("Number after clearing " + i + "th bit: " + result);
    }

    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }
    
}
