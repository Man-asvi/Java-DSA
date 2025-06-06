package Bit_Manipulation;

public class OddEven {
    
    public static void main(String[] args) {
        int number = 15;
        System.out.println("Is " + number + " odd? " + isOdd(number));
        System.out.println("Is " + number + " even? " + isEven(number));
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
    
}
