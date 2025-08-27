//Question: Implement a method to perform basic string compression using the counts of repeated characters.

package Strings;

public class StringCompression {
    public static String compress(String str) {
        String newStr = " ";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count;
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String input = "aaabbccdde";
        String result = compress(input);
        System.out.println("Compressed String: " + result);
    }
}

// Output:
// Compressed String: a3b2c2d2e
