//TILLING PROBLEM
/*Given a "2*N" board and tiles of size "2*1", 
  count the number of ways to tile the given board using the 2*1 tiles.

    (A tile can either be placed vertically or horizontally.)
 */

package RecursionPart2;

public class Q1 {
    public static int tilingWays(int n) {
        // Base case: If the length of the board is 0 or 1, there is only one way to tile it
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case:
        // 1. Place a tile vertically, which reduces the problem to tiling a "2*(n-1)" board
        int verticalPlacement = tilingWays(n - 1);
        // 2. Place two tiles horizontally, which reduces the problem to tiling a "2*(n-2)" board
        int horizontalPlacement = tilingWays(n - 2);
        return verticalPlacement + horizontalPlacement;
    }

    public static void main(String[] args) {
        int n = 4; // Length of the board
        int result = tilingWays(n);
        System.out.println("Number of ways to tile a 2*" + n + " board: " + result);
    }
}
