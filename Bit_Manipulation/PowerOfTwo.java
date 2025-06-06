package Bit_Manipulation;

public class PowerOfTwo {
    
    public static void main(String[] args) {
        int number = 15;
        System.out.println("Is " + number + " a power of two? " + isPowerOfTwo(number));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {return false;}
        return (n & (n - 1)) == 0;
    }
    
}
