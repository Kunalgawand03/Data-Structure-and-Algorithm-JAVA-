package Bitmanipulation;

public class OddEven {
    public class Bitmanipulation {
        public static void oddOrEven(int n) {
            int bitMask = 1;
            if ((n & bitMask) == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }
        public static void main(String[] args) {
            int n = 5;
            oddOrEven(n);
        }
    }
}

// Output:
// Odd Number
