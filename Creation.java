import java.util.Scanner;

public class Creation {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {  
                    // If the key is found, return true
                    System.out.println("Key found at position: [" + i + "][" + j + "]");
                    return true; // key found
                }
            }
        }
        return false; // key not found
    }

	public static void main(String args[]) {
        // Creating a 2D array
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Displaying the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Searching for a key in the 2D array
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        boolean found = search(matrix, key);
        if (!found) {
            System.out.println("Key not found in the matrix.");
        }
        sc.close(); // Close the scanner to prevent resource leak
        System.out.println("Search completed.");


    }
}



//Output example:
// Enter element at position [0][0]: 1
// Enter element at position [0][1]: 2          
// Enter element at position [0][2]: 3
// Enter element at position [1][0]: 4
// Enter element at position [1][1]: 5
// Enter element at position [1][2]: 6
// Enter element at position [2][0]: 7
// Enter element at position [2][1]: 8
// Enter element at position [2][2]: 9
// 1 2 3
// 4 5 6
// 7 8 9
// Enter the key to search: 5
// Key found at position: [1][1]
// Search completed.
