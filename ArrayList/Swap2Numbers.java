package ArrayList;

import java.util.ArrayList;

public class Swap2Numbers {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> ArrayList = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(6);
        
        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);
    }
}

// Output:
// [9, 2, 5, 8, 6]
// [9, 8, 5, 2, 6]
// Explanation: The code defines a method to swap two elements in an ArrayList given their indices
// and demonstrates its usage by swapping elements at indices 1 and 3 in a sample list. The output shows the list before and after the swap operation.
