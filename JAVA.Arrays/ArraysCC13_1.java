// Max Subarray Sum using brute force
// This code finds the maximum subarray sum using a brute force approach.

public class ArraysCC13_1 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println("Subarray from index " + start + " to " + end + " has sum: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 3, 4, -5, 6};
        maxSubarraySum(numbers);
    }
}
