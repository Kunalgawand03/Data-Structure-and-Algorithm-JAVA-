/* Remove Duplicates in a string
 Given a string, remove the duplicate characters from the string.
 */

package RecursionPart2;

public class Q2 {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        // Base case: If the index reaches the end of the string, print the new string
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        // Check if the character has already been encountered
        if (map[currChar - 'a'] == true) {               //map ==> boolean array to keep track of encountered characters
            // If yes, skip this character and move to the next index
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // If no, include this character in the new string and mark it as encountered
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }
}
