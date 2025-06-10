package Stack;
import java.util.Stack;

public class DuplicateParanthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (!s.isEmpty()) {
                    s.pop(); // pop the opening '('
                }

                if (count == 0) {
                    // means nothing between ()
                    return true;
                }
            } else {
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        String str2 = "((a+b))";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}