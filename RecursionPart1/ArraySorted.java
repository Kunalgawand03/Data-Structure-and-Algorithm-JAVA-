package RecursionPart1;

public class ArraySorted {
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length - 1) {
            return true; // Base case: If we reach the last element, the array is sorted
        }

        if(arr[i] > arr[i + 1]) {
            return false; // If the current element is greater than the next, the array is not sorted
        }

        return isSorted(arr, i + 1); // Recursive call for the next index
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0)); // Output: true
    }
}

//Output:
// true

