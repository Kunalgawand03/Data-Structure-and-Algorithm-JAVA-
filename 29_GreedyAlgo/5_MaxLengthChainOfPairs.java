package GreedyAlgo;
import java.util.*;

public class 5_MaxLengthChainOfPairs {
    public static void main(String[] args) {  //O(n log n)
        int pairs[][] = {{5, 24}, {15, 25}, {27, 40}, {50, 60}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // Sort based on second element of pair

        int chainLength = 1;
        int chainEnd = pairs[0][1];  // Initialize with end of first pair

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) { // If start of current pair is greater than end of last selected pair
                chainLength++;
                chainEnd = pairs[i][1]; // Update lastEnd to current pair's end
            }
       }
        System.out.println("Maximum Length of Chain of Pairs = " + chainLength);
    }
}

// Example Output:
// Maximum Length of Chain of Pairs = 3
// Explanation: The selected pairs are (5, 24), (27, 40), and (50, 60).
