package Backtracking;

public class BacktrackinonArrays {
    public static void changeArr(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // Recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // Function call

        // Backtracking
        arr[i] = arr[i] - 2; // Reverting the change for backtracking
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}


// Output:
// 1 2 3 4 5
//  -1 0 1 2 3

// Explanation:
// The first line of output is from the base case when the array is fully populated.
// The second line is from the final printArr call in main, showing the array after backtracking.
// The elements have been decremented by 2 during backtracking.
