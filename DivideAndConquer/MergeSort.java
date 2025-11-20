package DivideAndConquer;

public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei) {
        // Base case: If the array has one or no elements, it's already sorted
        if (si >= ei) {
            return;
        }

        // Find the middle index
        int mid = si + (ei - si) / 2;

        // Recursively sort the left half
        mergeSort(arr, si, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, ei);

        // Merge the two sorted halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // Temporary array to store merged elements
        int i = si; // Pointer for the left subarray
        int j = mid + 1; // Pointer for the right subarray
        int k = 0; // Pointer for the temporary array

        // Merge the two subarrays into the temporary array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left subarray
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right subarray
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        // Copy the sorted elements back into the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }   
}

// Output:
// Original array:
// 6 3 9 5 2 8
// Sorted array:
// 2 3 5 6 8 9


