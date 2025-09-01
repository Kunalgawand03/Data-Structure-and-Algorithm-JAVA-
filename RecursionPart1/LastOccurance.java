package RecursionPart1;

public class LastOccurance {
    public static int lastOccurance(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1; // Base case: If we reach the end of the array, return -1 (not found)
        }

        int isFound = lastOccurance(arr, key, i + 1); // Recursive call for the next index

        if(isFound == -1 && arr[i] == key) {
            return i; // If the current element matches the key and no occurrence found in the rest of the array, return the index
        }
        return isFound; // Return the index found in the rest of the array

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 5};
        int key = 2;
        int result = lastOccurance(arr, key, 0);
        System.out.println("Last occurrence of " + key + " is at index: " + result);
    }
}

//Output:
// Last occurrence of 2 is at index: 4
