package 28_Queues;
import java.io.*;
import java.util.*;

public class 6_StackUsing2Queue {
    public static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        static int top;

        // Check if stack is empty
        public static boolean isEmpty() {
            return q1.isEmpty();
        }

        // Push element onto stack
        public static void push(int data) {
            if(!q1.isEmpty()) {
                q1.add(data);
                top = data;
            } else {
                q2.add(data);
                top = data;
            }
        }

        // Pop element from stack
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            // Transfer elements from q1 to q2, except the last one
            if(!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else { // Transfer elements from q2 to q1, except the last one
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        // Peek at the top element of the stack
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top = -1;

            // Transfer elements to find the top element without removing it
            if(!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Top Element: " + s.peek()); // 3
        System.out.println("Popped Element: " + s.pop()); // 3
        System.out.println("Top Element: " + s.peek()); // 2
        System.out.println("Popped Element: " + s.pop()); // 2
        System.out.println("Popped Element: " + s.pop()); // 1
        System.out.println("Is Stack Empty? " + s.isEmpty()); // true
    }
}
