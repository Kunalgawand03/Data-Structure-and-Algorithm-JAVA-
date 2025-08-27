//Que: Given a route containing 4 directions (N, S, E, W), find the shortest path to reach the destination.
//IMP for Interview
package Strings;

public class Shortestpath {
    public static float ShortestPath(String path) {
        int x = 0, y= 0;
        for (int i = 0; i<path.length(); i++) {
            char dir = path.charAt(i);

            // Update coordinates based on direction
            // N increases y, S decreases y, E increases x, W decreases x
            

            //South
            if(dir == 'S') {
                y--;
            }
            //North
            else if(dir == 'N') {
                y++;
            }
            //East
            else if(dir == 'E') {
                x++;
            }
            //West
            else if(dir == 'W') {
                x--;
            }

        }
        // The shortest path is the sum of the absolute values of x and y
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path = "NNEESSWW";
        System.out.println("Shortest Path: " + ShortestPath(path));
    }
}

// Output: Shortest Path: 0.0
// Explanation: The path returns to the origin, so the shortest distance is 0.