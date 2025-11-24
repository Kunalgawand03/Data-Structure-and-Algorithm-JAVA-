package GreedyAlgo;
import java.util.*;

public class 4_MinSumAbsoluteDiffPair {
    public static void main(String[] args) {
        int[] arr1 = {4, 1, 8};
        int[] arr2 = {2, 3, 6};
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int minSum = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            minSum += Math.abs(arr1[i] - arr2[i]);
        }
        
        System.out.println("Minimum Sum of Absolute Differences = " + minSum);
    }
}

// Example Output:
// Minimum Sum of Absolute Differences = 5 