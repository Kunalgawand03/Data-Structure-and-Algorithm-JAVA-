package Backtracking;

public class NQueens {

    // Duplicate nQueens method removed.

    public static void printBoard(char board[][]) {
        System.out.println("-----Chess Board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {  // try to place queen in every column
            if (isSafe(board, row, j)) {             // place queen if it is safe
                board[row][j] = 'Q'; // place queen
                nQueens(board, row + 1); // function call
                board[row][j] = 'x'; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialize chess board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
}


// Output:
// -----Chess Board-----
// x Q x x
// x x x Q
// Q x x x
// x x Q x

// -----Chess Board-----
// x x Q x
// Q x x x
// x x x Q
// x Q x x

// Explanation:
// The output shows all possible arrangements of 4 queens on a 4x4 chessboard
// such that no two queens threaten each other.
// Each 'Q' represents a queen, and 'x' represents an empty space.
// The function uses backtracking to explore all potential placements of queens row by row,
// checking for safety before placing each queen and backtracking when necessary.
