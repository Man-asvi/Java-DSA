package Backtracking;

public class KeypadCombinations {

    static String[] keypad = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void generateCombinations(String digits, int index, String current) {
        if (index == digits.length()) {
            System.out.println(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, index + 1, current + letters.charAt(i));
        }
    }

    public static void main(String[] args) {
        String input = "59";

        if (!input.isEmpty()) {
            generateCombinations(input, 0, "");
        }
    }
}