package 28_Queues;
import java.io.*;
import java.util.*;

public class 8_Interleave2Halves {
    
    public static void interLeave(queue){
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = queue.size();
        int halfSize = size / 2;

        // Step 1: Dequeue first half elements and store in firstHalf queue
        for (int i = 0; i < halfSize; i++) {
            firstHalf.add(queue.remove());
        }

        // Step 2: Interleave the two halves
        while (!firstHalf.isEmpty()) {
            queue.add(firstHalf.remove()); // Add from first half
            queue.add(queue.remove());      // Add from second half
        }

        // Print the interleaved queue
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        interleave(queue);
    }
}

// Output:
// 1 6 2 7 3 8 4 9 5 10
// This code interleaves the two halves of a queue containing an even number of elements.
