package 28_Queues;
import java.util.*;

public class 3_QueueusingLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // Check if the queue is empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add - O(1)
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) { // Queue is empty
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove - O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int frontValue = head.data;
            head = head.next;
            if (head == null) { // If the queue becomes empty
                tail = null;
            }
            return frontValue;
        }

        // Peek - O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

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

