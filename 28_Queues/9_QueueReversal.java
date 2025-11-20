import java.util.*;

public class 9_QueueReversal {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Dequeue all elements from the queue and push them onto the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2: Pop all elements from the stack and enqueue them back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}

// Output:
// Original Queue: [1, 2, 3, 4, 5]
// Reversed Queue: [5, 4, 3, 2, 1]
// This code reverses the elements of a queue using a stack.
// It first transfers all elements from the queue to the stack, which reverses their order,
// and then transfers them back to the queue, resulting in a reversed queue.