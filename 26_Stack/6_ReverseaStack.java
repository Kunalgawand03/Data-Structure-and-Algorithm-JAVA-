import java.util.Stack;
package Stack;

public class 6_ReverseaStack {
    public static void reverseStack(Stack<Integer> stack) {
        // Base case: If stack is empty, return
        if (stack.isEmpty()) {
            return;
        }

        // Step 1: Pop the top element
        int top = stack.pop();

        // Step 2: Recursive call to reverse the remaining stack
        reverseStack(stack);

        // Step 3: Push the popped element at the bottom of the reversed stack
        pushAtBottom(stack, top);
    }

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        // Base case: If stack is empty, push the data
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        // Step 1: Pop the top element
        int top = stack.pop();

        // Step 2: Recursive call to push data at bottom
        pushAtBottom(stack, data);

        // Step 3: Push the top element back onto the stack
        stack.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}

//Output:
// Original Stack: [1, 2, 3, 4, 5]
// Reversed Stack: [5, 4, 3, 2, 1]
