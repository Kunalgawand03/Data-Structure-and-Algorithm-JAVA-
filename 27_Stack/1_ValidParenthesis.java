package 27_Stack;
import java.util.*;

public class 1_ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        } 
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s)); // Output: true
    }
}

// Time Complexity: O(n), where n is the length of the string. We traverse the string once.
// Space Complexity: O(n) in the worst case, when all characters are opening brackets and

//Output: true 
//we push them onto the stack.
