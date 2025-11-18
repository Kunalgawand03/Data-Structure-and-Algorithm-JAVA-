//Stack using Collections Framework in Java

package 26_Stack;
import java.util.Stack;

public class 3_StackusingCollections {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek at the top element of the stack
        System.out.println("Top element is: " + stack.peek());

        // Pop elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}

//Output:
// Top element is: 3
// Popped element: 3
// Popped element: 2
// Popped element: 1

