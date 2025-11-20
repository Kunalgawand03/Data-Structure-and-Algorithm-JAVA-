package 28_Queues;
import java.util.*;

public class 1_QueueusingArrays {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //Add - O(1)
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //Remove - O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            //shift all the elements to left by one
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        //Peek - O(1)
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
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
// Time Complexity:
// Add: O(1) - Adding an element to the end of the queue takes constant
// Remove: O(n) - Removing an element requires shifting all other elements.
// Peek: O(1) - Accessing the front element takes constant time.


