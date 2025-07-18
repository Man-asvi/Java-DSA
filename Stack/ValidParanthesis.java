package Stack;
import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            //opening
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                //closing
                if(s.isEmpty()) {
                    return false;
                }

                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({})[]}";
        System.out.println(isValid(str));
    }
}