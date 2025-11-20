package DivideAndConquer;

public class QuikSort {
    public static void quickSort(int arr[], int si, int ei) {
        // Base case: If the array has one or no elements, it's already sorted
        if (si >= ei) {
            return;
        }

        // Partition the array and get the pivot index
        int pIdx = partition(arr, si, ei);

        // Recursively sort the left half
        quickSort(arr, si, pIdx - 1);

        // Recursively sort the right half
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // Choosing the last element as pivot
        int i = si - 1; // Pointer for the smaller element

        for (int j = si; j < ei; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[ei] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1; // Return the partitioning index
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 8, 4, 2 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}

// Output:
// Sorted array:
// 2 3 4 5 8

