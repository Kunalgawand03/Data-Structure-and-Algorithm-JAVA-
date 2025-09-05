//Binary Strings without consecutive 1's
/*Given a number n, print all binary strings of size n without consecutive 1's.
  For example, if n = 3, then the output should be:
  
  000
  001
  010
  100
  101
  
  There are total 5 binary strings of size 3 without consecutive 1's.
*/

package RecursionPart2;

public class Q4 {
    public static void printBinStrings(int n, char LastPlace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }

        // If the last placed character is '0', we can place either '0' or '1' at the current position
        printBinStrings(n - 1, '0', str + '0');

        // If the last placed character is '1', we can only place '0' at the current position
    if(LastPlace == '0') {  
            printBinStrings(n - 1, '1', str + '1');
        }
    }

    public static void main(String[] args) {
        int n = 3; // Length of the binary strings
        printBinStrings(n, '0', ""); // Start with an empty string and last placed character as '0'
    }
}

// Output:
// 000
// 001
// 010
// 100
// 101
// Explanation:
// The binary strings of length 3 without consecutive 1's are:
// 1. 000
// 2. 001
// 3. 010
// 4. 100
// 5. 101
// Thus, there are a total of 5 such binary strings.
// The function uses recursion to build the binary strings character by character,
// ensuring that no two consecutive '1's are placed next to each other.
// The base case is when the length of the string to be formed (n) is 0, at which point
// the formed string is printed. The function explores both possibilities of placing '0' and '