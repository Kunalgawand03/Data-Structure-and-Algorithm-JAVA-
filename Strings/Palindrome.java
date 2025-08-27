//Question: Write a Java program to check if a given string is a palindrome.
package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length()/2 ; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1 )) {
                return false; // Not a palindrome
            }
        }
        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        String testString = "madam";
        if (isPalindrome(testString)) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }
    }
    
}

// Output: madam is a palindrome.
// The function correctly identifies the string "madam" as a palindrome.

