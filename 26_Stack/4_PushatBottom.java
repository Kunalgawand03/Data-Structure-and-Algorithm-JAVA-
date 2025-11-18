//Push at Bottom of a Stack using Recursion
package 26_Stack;
import java.util.Stack;

public class 4_PushatBottom {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case: If stack is empty, push the data
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Step 1: Pop the top element
        int top = s.pop();

        // Step 2: Recursive call to push data at bottom
        pushAtBottom(s, data);

        // Step 3: Push the top element back onto the stack
        s.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original Stack: " + s);

        int data = 0;
        pushAtBottom(s, data);

        System.out.println("Stack after pushing " + data + " at bottom: " + s);
    }
}

//Output:
// Original Stack: [1, 2, 3]
// Stack after pushing 0 at bottom: [0, 1, 2, 3]