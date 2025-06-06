package Recursion;
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        // System.out.println("The factorial of " + n + " is: " + factorial(n));

        // System.out.println("The sum of first " + n + " natural numbers is: " + SumOfN(n));

        // System.out.print("Enter the position in Fibonacci series: ");
        // int fibPosition = sc.nextInt();
        // System.out.println("The Fibonacci number at position " + fibPosition + " is: " + fibonacci(fibPosition));

        // System.out.print("Enter the size of the array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements of the array:");

        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // if (isSorted(arr, 0)) {
        //     System.out.println("The array is sorted.");
        // } else {
        //     System.out.println("The array is not sorted.");
        // }

        // System.out.print("Enter the size of the array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements of the array:");
        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Enter the target element: ");
        // int target = sc.nextInt();
        // int firstIndex = firstOccurrence(arr, 0, target);
        // if (firstIndex != -1) {
        //     System.out.println("The first occurrence of " + target + " is at index: " + firstIndex);
        // } else {
        //     System.out.println("Element not found in the array.");
        // }

        // int lastIndex = lastOccurrence(arr, size - 1, target);
        // if (lastIndex != -1) {
        //     System.out.println("The last occurrence of " + target + " is at index: " + lastIndex);
        // } else {
        //     System.out.println("Element not found in the array.");
        // }

        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        System.out.println(base + " raised to the power of " + exponent + " is: " + PowerOptimized(base, exponent));
        sc.close();
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1; 
        }
        return num * factorial(num - 1); 
    }

    public static int SumOfN(int num) {

        if (num == 0) {
            return 0; 
        }
        return num + SumOfN(num - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true; 
        }
        if (arr[index] > arr[index + 1]) {
            return false; 
        }
        return isSorted(arr, index + 1);
    }

    public static int firstOccurrence(int[] arr, int index, int target) {
        if (index >= arr.length) {
            return -1; 
        }
        if (arr[index] == target) {
            return index; 
        }
        return firstOccurrence(arr, index + 1, target);
    }

    public static int lastOccurrence(int[] arr, int index, int target) {
        if (index < 0) {
            return -1; 
        }
        if (arr[index] == target) {
            return index; 
        }
        return lastOccurrence(arr, index - 1, target);
    }

    public static int Power(int base, int exponent) {
        if (exponent == 0) {
            return 1; 
        }
        return base * Power(base, exponent - 1);
    }

    public static int PowerOptimized(int base, int exponent) {
        if (exponent == 0) {
            return 1; 
        }
        if (exponent % 2 == 0) {
            int halfPower = PowerOptimized(base, exponent / 2);
            return halfPower * halfPower; 
        } else {
            return base * PowerOptimized(base, exponent - 1); 
        }
    }
}

