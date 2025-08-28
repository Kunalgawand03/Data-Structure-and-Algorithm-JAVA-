package Bitmanipulation;

public class Powerof2 {
    public static boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }

    public static void main(String args[]) {
        int n = 16;
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is not a power of 2");
        }
    }
}

// Output: 16 is a power of 2
// Explanation: 16 in binary is 10000. Subtracting 1 gives 01111. 
//              The AND operation results in 0, confirming that 16 is a power of 2.
