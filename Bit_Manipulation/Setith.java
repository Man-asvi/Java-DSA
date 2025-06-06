package Bit_Manipulation;

public class Setith {
    
    public static void main(String[] args) {
        int number = 5; // Example number
        int i = 1; // Example bit position
        System.out.println("Number before setting " + i + "th bit: " + number);
        int result = setIthBit(number, i);
        System.out.println("Number after setting " + i + "th bit: " + result);
    }

    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }
    
}
