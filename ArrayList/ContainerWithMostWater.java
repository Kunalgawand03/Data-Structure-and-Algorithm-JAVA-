//Question: Given n non-negative integers a1, a2, ..., an , 
//where each represents a point at coordinate (i, ai). 
//n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
//Find two lines, which together with x-axis forms a container, such that the container contains the most water.

import java.util.ArrayList;
package ArrayList;

public class ContainerWithMostWater {
    public static int storewater(ArrayList<Integer> height) {
        int maxwater = 0;
        for (int i = 0; i < height.size(); i++) {             
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currwater = ht * width;
                maxwater = Math.max(maxwater, currwater);
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("max water that can be stored is = " + storewater(height));
    }
}

// Output: max water that can be stored is = 49
// Explanation: The code defines a method to calculate the maximum amount of water that can be contained between two lines represented by an ArrayList of heights.
// It uses a nested loop to evaluate all possible pairs of lines, calculating the area formed by each pair and updating the maximum area found.
// The main method demonstrates the usage of this function with a sample list of heights and prints the result.


