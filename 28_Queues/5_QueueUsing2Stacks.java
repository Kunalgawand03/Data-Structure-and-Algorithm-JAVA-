// Queue implementation using two stacks

import java.io.*;
import java.util.*;

public class 5_QueueUsing2Stacks {
    public static Queue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();
        
        public static boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }   

        //Add element to the queue
        public static void add(int data) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            stack1.push(data);

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            } 
        }

        //Remove element from the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.pop();
        }

        //Peek element at the front of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Removed Element: " + q.remove()); // 1
        System.out.println("Removed Element: " + q.remove()); // 2
        q.add(4);
        System.out.println("Removed Element: " + q.remove()); // 3
        System.out.println("Removed Element: " + q.remove()); // 4
    }
}
