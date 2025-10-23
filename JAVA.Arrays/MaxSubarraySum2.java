// Max Subarray Sum using prefix sums
// This code finds the maximum subarray sum using a prefix sum approach.
public class MaxSubarraySum2 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[numbers.length];
        
        prefixSum[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
                
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


//output:
// Maximum subarray sum is: 8
// Time Complexity: O(n^2)
// Space Complexity: O(n)
// Explanation://
// The code first constructs a prefix sum array to store the cumulative sums of the input array.
// It then iterates through all possible subarrays using two nested loops.
// For each subarray defined by the starting index 'i' and ending index 'j', it calculates the current sum using the prefix sum array.
// If the starting index is 0, the current sum is simply the prefix sum at the ending index.
// Otherwise, it subtracts the prefix sum at the index before the starting index from the prefix sum at the ending index.
// The maximum sum is updated whenever the current sum exceeds it.
