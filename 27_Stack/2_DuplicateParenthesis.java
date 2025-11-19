//Question: Check for Duplicate Parentheses in an Expression
package 27_Stack;
import java.util.Stack;

public class 2_DuplicateParenthesis {
    public static boolean duplicateParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    stack.pop();               // Pop the opening parenthesis
                    count++;
                }
                
                if (count == 0) {
                    return true; // Duplicate parentheses found
                }
            } else {
                stack.push(ch);
            }
        }

        return false; // No duplicates found
}

    public static void main(String[] args) {
        String str = "((a+b)+((c+d)))";
        System.out.println(duplicateParenthesis(str)); // Output: true
    }
}

// Time Complexity: O(n), where n is the length of the string. We traverse the string once.
// Space Complexity: O(n) in the worst case, when all characters are opening brackets and



