//Find if any pair in a sorted and rotated array has a given sum

package ArrayList;
import java.util.ArrayList;
import java.lang.reflect.Array;

public class PairSum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // Find the pivot point where the array is rotated
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int lp = (pivot + 1) % n; // Smallest element index
        int rp = pivot;           // Largest element index

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}

// Output: true
// Explanation: The code defines a method to check if there exists any pair of integers in a
// sorted and rotated ArrayList that sums up to a specified target value.
// It first identifies the pivot point where the rotation occurs, then uses a two-pointer technique
// to evaluate potential pairs by adjusting pointers based on the current sum compared to the target.
// The main method demonstrates the usage of this function with a sample rotated list and target sum,
// printing the result.

