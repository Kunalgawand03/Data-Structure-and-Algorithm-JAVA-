package DivideAndConquer;

public class DivideConquer {
    public static int search(int  arr[], int key, int si, int ei) {
        if(si > ei){
            return -1;
        }
        
        // Find the mid element
        int mid = si + (ei - si) / 2;
        
        
        if(arr[mid] == key){     // Key found
            return mid;
        }

        if(arr[si] <= arr[mid]){      // Left part is sorted
            if(arr[si] <= key && key <= arr[mid]){   // Key lies in left part
                return search(arr, key, si, mid - 1);       // Search in left part
            } else {
                return search(arr, key, mid + 1, ei);
            }
        } else {
            if(arr[si] <= key && key <= arr[ei]){        // Key lies in right part
                return search(arr, key, mid + 1, ei);
            } else {
                return search(arr, key, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int key = 0;
        int n = arr.length;

        int index = search(arr, key, 0, n - 1);
        if(index != -1){
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}


// Output:
// Key found at index: 4
