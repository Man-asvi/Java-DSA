package Recursion;

public class Occurences {
    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'l';
        int count = countOccurrences(str, ch, 0);
        System.out.println("Character '" + ch + "' occurs " + count + " times in the string \"" + str + "\".");
    }

    public static int countOccurrences(String str, char ch, int index) {
        // Base case: if the index reaches the end of the string
        if (index == str.length()) {
            return 0;
        }
        
        // Check if the current character matches 'ch'
        int count = (str.charAt(index) == ch) ? 1 : 0;
        
        // Recursive call for the next index
        return count + countOccurrences(str, ch, index + 1);
    }
    
}
