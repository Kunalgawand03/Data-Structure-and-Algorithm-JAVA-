import java.util.*;

public class 11_StackUsingDeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // Push element onto stack
        public void push(int data) {
            deque.addLast(data);
        }


        // Pop element from stack
        public int pop() {
            return deque.removeLast();
    
        // Peek at the top element of the stack
        public int peek() {
            return deque.getLast();
        }

    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek()); // Output: 30

        System.out.println("Popped element is: " + stack.pop()); // Output: 30
        System.out.println("Top element is: " + stack.peek()); // Output: 20
    }   
}

// Output:
// Top element is: 30
// Popped element is: 30
// Top element is: 20
// This code implements a stack using a Deque (Double-Ended Queue) in Java.
// It provides push, pop, and peek operations to manage stack elements.
// Time Complexity: O(1) for push, pop, and peek operations
// Space Complexity: O(n)