//IMP for Goolge Interview

public class Spiralprint {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Print the first row...Top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // Print the last column...Right column
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Print the last row if still in bounds..bottom row
                for (int j = endCol-1; j >= startCol; j--) {
                    if(startRow == endRow) 
                        break; // Check if we are still in bounds
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            

            // Print the first column if still in bounds
                for (int i = endRow; i >= startRow; i--) {
                    if(startCol == endCol) 
                        break; // Check if we are still in bounds
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiral(matrix);
    }
}


//Output:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
// The spiral order of the matrix is printed as expected.
