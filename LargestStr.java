//Que: For a given set of strings, find the largest string 
 
package Strings;

public class LargestStr {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry", "date"};
        
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("Largest String: " + largest);
    }
}

// Output: Largest String: date
