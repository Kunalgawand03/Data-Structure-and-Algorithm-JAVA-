package Stack;
import java.util.Stack;

public class 5_ReverseString {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
       
        int idx = 0;
        // Push all characters of the string onto the stack
        while (idx < str.length()) {
            stack.push(str.charAt(idx));
            idx++;
        }
        StringBuilder reversedStr = new StringBuilder();
        // Pop all characters from the stack to get them in reverse order
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        return reversedStr.toString();
        

    }

    public static void main(String args[]) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
} 

//Output:
// Original String: Hello, World!
// Reversed String: !dlroW ,olleH
//Reverse a String using Recursion

