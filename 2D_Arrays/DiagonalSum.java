public class DiagonalSum {

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        
        // 1st Approch
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         // Check if it's a diagonal element
        //         if(i == j) {
        //             sum += matrix[i][j];
        //         }
        //         // Check if it's an anti-diagonal elemente
        //         else if(i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // 2nd Aproach
        for (int i = 0; i < matrix.length; i++) {         //j== length - 1 - i
            // Add the primary diagonal element
            sum += matrix[i][i];
            // Add the secondary diagonal element
            sum += matrix[i][matrix.length - 1 - i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println("Diagonal Sum: " + diagonalSum(matrix)); // Output: 25
    }
}


// Time Complexity: O(n)
// Space Complexity: O(1)

//Output:
//Diagonal Sum: 68
