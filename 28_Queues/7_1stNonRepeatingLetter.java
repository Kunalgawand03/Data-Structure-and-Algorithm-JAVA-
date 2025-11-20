package 28_Queues;
import java.io.*;
import java.util.*;

public class 7_1stNonRepeatingLetter {
    public static void firstNonRepeating(String str) {
        Queue<Character> queue = new LinkedList<>();
        int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            freq[ch - 'a']++;      // Increment frequency of the character

            while (!queue.isEmpty()) {
                if (freq[queue.peek() - 'a'] > 1) {
                    queue.remove();
                } else {
                    System.out.print(queue.peek() + " ");
                    break;
                }
            }

            if (queue.isEmpty()) {
                System.out.print(-1 + " ");
            } 
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String str = "aabccxb";
        firstNonRepeating(str);
    }
}

//Output:
// -1 a b b x x
// This code finds the first non-repeating character in a stream of characters using a queue and frequency array.
// It maintains the order of characters and efficiently tracks their frequencies to determine the first non-repeating
// character at each step in the stream.
// Time Complexity: O(n)
// Space Complexity: O(1) (since the frequency array size is fixed at 26
// for lowercase English letters)
// Explanation:
// 1. We use a queue to keep track of the order of characters as they appear
//    in the stream.
// 2. We maintain a frequency array to count occurrences of each character.
// 3. For each character in the stream, we add it to the queue and update its
//    frequency.
// 4. We then check the front of the queue:
//    - If the character at the front has a frequency greater than 1, it means
//      it is repeating, so we remove it from the queue.
//    - If the character at the front has a frequency of 1, it is the first
//      non-repeating character, and we print it.
// 5. If the queue becomes empty, it means there are no non-repeating characters
//    at that point, so we print -1.
// 6. This process continues for each character in the input string.
// for lowercase English letters)


