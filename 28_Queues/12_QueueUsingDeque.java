import java.util.Deque;
import java.util.LinkedList;

public class 12_QueueUsingDeque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // Enqueue element into queue //add element at the end
        public void add(int data) {
            deque.addLast(data);
        }

        // Dequeue element from queue
        public int remove() {      //remove element from the front
            return deque.removeFirst();
        }

        // Peek at the front element of the queue
        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String args[]) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front element is: " + queue.peek()); // Output: 10

        System.out.println("Dequeued element is: " + queue.remove()); // Output: 10
        System.out.println("Front element is: " + queue.peek()); // Output: 20
    }
}
