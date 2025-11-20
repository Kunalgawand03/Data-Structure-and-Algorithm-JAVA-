import java.util.LinkedList;
import java.util.Queue;

public class 4_QueueUsingJCF {
    public static void main(String[] args) {
        // Create a Queue using Java Collections Framework
        Queue<Integer> queue = new LinkedList<>();     // Using LinkedList to implement Queue//Interview Que

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Remove an element from the queue
        int removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);

        // Peek at the front element of the queue
        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);
    }
}

//Output:
// Queue: [1, 2, 3]
// Removed Element: 1
// Front Element: 2
// Queue after removal: [2, 3]
// This code demonstrates how to use the Java Collections Framework (JCF) to implement a queue.
// It uses the `LinkedList` class to create a queue, allowing for efficient addition and

