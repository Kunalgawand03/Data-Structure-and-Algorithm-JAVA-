//Que: Find the first occurrence of an element in an array using recursion.
package RecursionPart1;

public class FirstOccurance {
    public static int firstOccurance(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1; // Base case: If we reach the end of the array, return -1 (not found)
        }

        if(arr[i] == key) {
            return i; // If the current element matches the key, return the index
        }

        return firstOccurance(arr, key, i + 1); // Recursive call for the next index
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 5};
        int key = 2;
        int result = firstOccurance(arr, key, 0);
        System.out.println("First occurrence of " + key + " is at index: " + result);
    }
}


//Output:
// First occurrence of 2 is at index: 1