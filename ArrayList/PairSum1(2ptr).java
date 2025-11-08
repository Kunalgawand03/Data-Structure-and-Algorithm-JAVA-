package ArrayList;
import java.util.ArrayList;

public class PairSum1(2ptr) {
    public static boolean pairSum2ptr(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 9;
        System.out.println(pairSum2ptr(list, target));
    }
}

// Output: true
// Explanation: The code defines a method to check if there exists any pair of integers in the
// given ArrayList that sums up to a specified target value.
// It uses a two-pointer technique to efficiently evaluate potential pairs by adjusting pointers based on the current
// sum compared to the target.
// The main method demonstrates the usage of this function with a sample list and target sum, printing the result.
