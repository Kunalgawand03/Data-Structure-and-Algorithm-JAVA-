public class TrappedRainwater {
    public static int trappedRainwater(int height[]){
        int n = height.length;

        //calculate left max array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }   
        //calculate right max array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        //calculate trapped water
        int trappedWater = 0;
        for(int i = 0; i < n; i++){
            //water level at index i is the minimum of left max and right max
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //water trapped at index i is water level minus height at index i
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;


    }
    public static void main(String args[]) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trappedRainwater(height);
        System.out.println("Trapped rainwater is: " + result);
    }
}


//output:
// Trapped rainwater is: 6
// Time Complexity: O(n)
// Space Complexity: O(n)
// Explanation:
// The code first calculates the maximum height to the left of each index and stores it in the leftMax array.
// It then calculates the maximum height to the right of each index and stores it in the right
// max array.
// Finally, it iterates through each index to calculate the water level, which is the minimum of
// the left max and right max at that index.
// The trapped water at each index is then calculated by subtracting the height at that index
// from the water level, and the total trapped water is accumulated and returned.
// This approach ensures that we only traverse the array a few times, resulting in a linear time complexity of O(n).
