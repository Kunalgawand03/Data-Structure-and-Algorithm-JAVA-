package Bitmanipulation;

public class FastExpo {
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            // if n is odd
            if ((n & 1) != 0) {  // Check if the last bit is set i.e.LSB is 1
                ans = ans * a;
            }
            a = a * a; // square the base
            n = n >> 1; // right shift n by 1 (equivalent to n //= 2)
        }
        return ans;
    }
    public static void main(String args[]) {
        int a = 2; // base
        int n = 10; // exponent
        System.out.println(a + " raised to the power " + n + " is: " + fastExpo(a, n));
    }
}

// Output: 2 raised to the power 10 is: 1024
// Explanation: 2^10 = 1024. The function efficiently computes this using exponentiation by squaring.

