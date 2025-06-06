package String;

public class PalindromeString {
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String testString = "radar";
        System.out.println("Is \"" + testString + "\" a palindrome? " + isPalindrome(testString));
    }
}
