package SortingAlgo;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;                            // Assume the first element is the minimum
            // Find the minimum element in the remaining unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArr(arr);
        
        selectionSort(arr);
        
        System.out.println("Sorted array:");
        printArr(arr);
    }
}
