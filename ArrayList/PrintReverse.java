package ArrayList;
import java.util.ArrayList;
public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayListist = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i = list.size()-1; i>=0 ; i--){
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }
}

// Output:
// 5
// 4
// 3
// 2
// 1
// Explanation: The code initializes an ArrayList with integers from 1 to 5 and then prints them in reverse order using a for loop that starts from the last index down to the first index.
// The output shows the integers printed in reverse order, each on a new line.


