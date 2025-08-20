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

