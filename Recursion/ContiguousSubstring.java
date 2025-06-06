package Recursion;
import java.util.Scanner;
public class ContiguousSubstring {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int count = countContiguousSubstrings(str, 0, 0);
        System.out.println("Number of contiguous substrings that start and end with the same character: " + count);
    }
    public static int countContiguousSubstrings(String str, int start, int end) {
        if (start >= str.length()) {
            return 0;
        }
        if (end >= str.length()) {
            return countContiguousSubstrings(str, start + 1, start + 1);
        }
        int count = 0;
        if (str.charAt(start) == str.charAt(end)) {
            count = 1;
        }
        return count + countContiguousSubstrings(str, start, end + 1);
    }
}