package Bitmanipulation;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) !=0) { // Check if the last bit is set
                count++;
            }
            n = n >> 1; // Right shift n by 1 to check the next bit
        }
        return count;
    }
    
    public static void main(String args[]) {
        int n = 29; // Example number
        System.out.println("Number of set bits in " + n + " is: " + countSetBits(n));
    }
}

// Output: Number of set bits in 29 is: 4
// Explanation: 29 in binary is 11101, which has four 1s (set bits).
