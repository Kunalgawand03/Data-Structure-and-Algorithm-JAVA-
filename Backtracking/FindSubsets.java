package Backtracking;

public class FindSubsets {
    public static void findSubsets(String str,String ans, int i) {
        //base case
        if(i==str.length()) {
            System.out.println(ans);
            return;
        }
        //recursion
        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //no choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}

// Output:
// abc
// ab
// ac
// a
// bc
// b
// c
//
// Explanation:
// The output lists all possible subsets of the string "abc".
// Each line represents a different subset formed by including or excluding each character.
// The recursion explores both choices (including or excluding each character) at each step.
// The base case prints the accumulated subset when the end of the string is reached.


