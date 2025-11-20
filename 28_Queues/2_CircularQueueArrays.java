package 28_Queues;
import java.util.*;

public class 2_CircularQueueArrays {
    public static class CircularQueue {
        static int arr[];
        static int size;
        static int front;
        static int rear;
        

        CircularQueue(int n) {
            arr = new int[n];
            size = n;
            front = 0;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return ((rear + 1) % size) == front;
        }

        // Add - O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % size; // circular increment
            arr[rear] = data;
        }

        // Remove - O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int frontValue = arr[front];
            front = (front + 1) % size; // circular increment
            return frontValue;
        }

        // Peek - O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        CircularQueue q = new CircularQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

// Output:
// 1
// 2
// 3
// 4
// 5
// 6

// Explanation:
// In this implementation of a Circular Queue using arrays, 
// we maintain a count of the number of elements to efficiently check if the queue is empty or full. 
// The add and remove operations are performed in O(1) time by using modular arithmetic to wrap around the indices 
// when they reach the end of the array. This allows us to utilize the array space effectively without needing to shift elements, 
// as was necessary in a linear queue implementation.
// Time Complexity: O(1) for add, remove, and peek operations.
// Space Complexity: O(n) for the array used to store queue elements.

