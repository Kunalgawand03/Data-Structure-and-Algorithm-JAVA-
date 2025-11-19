//Que: Given an array representing heights of bars in a histogram, find the area of the largest rectangle that can be formed within the bounds of the histogram.

package 27_Stack;
import java.util.Stack;

public class 3_MaxRectAreaHistogram {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int nsr[] = new int[heights.length]; // Next Smaller to Right
        int nsl[] = new int[heights.length]; // Next Smaller to Left

        // Finding NSR
        Stack<Integer> stack = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
        // Clear the stack to reuse it for NSL
        stack.clear();

        // Finding NSL
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

        // Calculating max area
        for (int i = 0; i < heights.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights)); // Output: 10
    }
}

//Output: Largest Rectangle Area: 10

// pushed onto the stack.
// Auxiliary Space: O(n) for the stacks used to store indices of bars.
// Time Complexity: O(n), where n is the number of bars in the histogram. We traverse the heights array multiple times but each operation is O(1).


