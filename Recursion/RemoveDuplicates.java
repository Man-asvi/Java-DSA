package Recursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "string";
        String result = removeDuplicates(str);
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        }
        
        char firstChar = str.charAt(0);
        String remainingString = removeDuplicates(str.substring(1));
        
        if (remainingString.indexOf(firstChar) == -1) {
            return firstChar + remainingString;
        } else {
            return remainingString;
        }

    }

    public static void removeDuplicates(String str, int index, StringBuilder newStr) {
        // Base case: if the index reaches the end of the string
        if (index == str.length()) {
            System.out.println(newStr.toString());
            return;
        }

        // Check if the character at the current index is already in newStr
        char currentChar = str.charAt(index);
        if (newStr.indexOf(String.valueOf(currentChar)) == -1) {
            newStr.append(currentChar); // Add to newStr if not present
        }

        // Recursive call for the next index
        removeDuplicates(str, index + 1, newStr);
    }


    
}
