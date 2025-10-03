package Backtracking;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {   // reached destination  ...condition for last cell
            return 1;
        } else if (i == n || j == m) {    // crossed boundary
            return 0;
        }

        // recursive call
        int downWays = gridWays(i + 1, j, n, m);   // down call w1
        int rightWays = gridWays(i, j + 1, n, m);  // right call w2
 
        return downWays + rightWays;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Total ways to reach destination: " + gridWays(0, 0, n, m));
    }
}

//Output:
//Total ways to reach destination: 6
// There are 6 ways to reach from (0,0) to (2,2) in a 3x3 grid.
// (0,0) -> (0,1) -> (0,2) -> (1,2) -> (2,2)
// Explanation: The function gridWays calculates the number of unique paths from the top-left corner (0,0) to the bottom-right corner (n-1,m-1) of an n x m grid. The only allowed moves are down and right. The function uses recursion to explore all possible paths, summing the number of ways to reach the destination from each position. The base cases handle reaching the destination and crossing grid boundaries.
// The time complexity of this approach is O(2^(n+m)) in the worst case
// The space complexity is O(n+m) due to the recursion stack
