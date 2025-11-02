package ArrayList;
import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayListist = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(6);

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<list.size(); i++){
            if(max < list.get(i)) {
                max = list.get(i);
            }

            //max = Math.max(max, list.get(i))
        }
        System.out.println("max element is = " + max);
    }
}

// Output:
// max element is = 9
// Explanation: The code initializes an ArrayList with integers and then iterates through the list to find the maximum element by comparing each element with the current maximum. Finally, 
//it prints the maximum element found in the list.

