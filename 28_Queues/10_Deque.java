import java.util.*;

public class 10_Deque {
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();

        // Adding elements to the front and back of the deque
        deque.addFirst(10);  
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(25);

        System.out.println("Deque after additions: " + deque);

        // Removing elements from the front and back of the deque
        int front = deque.removeFirst();
        int back = deque.removeLast();

        System.out.println("Removed from front: " + front);
        System.out.println("Removed from back: " + back);
        System.out.println("Deque after removals: " + deque);

        // Accessing elements at both ends without removing
        int peekFront = deque.peekFirst();
        int peekBack = deque.peekLast();

        System.out.println("Element at front: " + peekFront);
        System.out.println("Element at back: " + peekBack);
    }
}

// Output:
// Deque after additions: [5, 10, 20, 25]
// Removed from front: 5
// Removed from back: 25
// Deque after removals: [10, 20]
// Element at front: 10
// Element at back: 20
// This code demonstrates the usage of a Deque (Double-Ended Queue) in Java.
