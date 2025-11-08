import java.util.Collections;
package ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class SortingAnAL {
    public static void main(String args[]) {
        ArrayList<Integer> ArrayListist = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(6);

        System.out.println("Before Sorting: " + list);
        Collections.sort(list);
        System.out.println("After Sorting: " + list);

         // Sorting in reverse order
        Collections.sort(list, Collections.reverseOrder());   //Thi line sorts the list in reverse order
        System.out.println("After Sorting in reverse order: " + list);
    }
}

// Output:
// Before Sorting: [9, 2, 5, 8, 6]
// After Sorting: [2, 5, 6, 8, 9]
// After Sorting in reverse order: [9, 8, 6, 5, 2]
