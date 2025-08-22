public class SearchSortedMtx {
    public static boolean staircaseSearch(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true; // Found the target
            } else if (matrix[row][col] > key) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        System.out.println("Element not found in the matrix.");
        return false; // Target not found
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int key = 7;
        staircaseSearch(matrix, key); // Output: Element found at: (1, 2)
    }

}

// Output: Element found at: (1, 2)
// The function successfully finds the element in the sorted matrix.
