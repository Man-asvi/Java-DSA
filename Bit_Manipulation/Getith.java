package Bit_Manipulation;

public class Getith {
    
    public static void main(String[] args) {
        int number = 5; // Example number
        int i = 2; // Example bit position
        System.out.println("The " + i + "th bit of " + number + " is: " + getIthBit(number, i));
    }

    public static int getIthBit(int n, int i) {
        return (n >> i) & 1;
    }
    
}
