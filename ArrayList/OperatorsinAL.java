package ArrayList;

import java.util.ArrayList;

public class OperatorsinAL {
    ArrayList<Integer> list = new ArrayList<>();

    public void insert(int val) {
        list.add(val);                  // Add element to the end of the list
    }

    public void remove(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);               // Remove element at the specified index
        } else {
            System.out.println("Index out of bounds");
        }
    }
    
    public int get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);                    // Get element at the specified index
        } else {
            System.out.println("Index out of bounds");
            return -1; // or throw an exception
        }
    }

    public int size() {
        return list.size();                // Return the size of the list
    }

    public static void main(String[] args) {
        OperatorsinAL al = new OperatorsinAL();
        al.insert(10);
        al.insert(20);
        al.insert(30);
        System.out.println("Element at index 1: " + al.get(1)); // Output: 20
        System.out.println("Size of ArrayList: " + al.size()); // Output: 3
        al.remove(1);
        System.out.println("Element at index 1 after removal: " + al.get(1)); // Output: 30
        System.out.println("Size of ArrayList after removal: " + al.size()); // Output: 2
    }

}

// Output:
// Element at index 1: 20
// Size of ArrayList: 3
// Element at index 1 after removal: 30
// Size of ArrayList after removal: 2

// Explanation:
// The code demonstrates basic operations on an ArrayList such as insertion, removal, retrieval, and size checking.
// It includes boundary checks for index-based operations to prevent errors.
// The main method tests these operations and prints the results to the console.
// The output shows the results of the operations performed on the ArrayList.
