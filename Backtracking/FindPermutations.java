package Backtracking;

public class FindPermutations {
    public static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // "abc" -> "ab" -> "a" -> ""
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}

// Output:
// abc
// acb
// bac
// bca
// cab
// cba
// Explanation:
// The output lists all possible permutations of the string "abc".
// Each line represents a different arrangement of the characters.
// The recursion builds permutations by fixing one character and permuting the rest.
// The base case prints the accumulated permutation when the input string is empty.

