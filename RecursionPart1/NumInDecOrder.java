package RecursionPart1;

public class NumInDecOrder {

    // Function to print numbers in decreasing order from n to 1
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n - 1);
    }
    
    // Function to print numbers in increasing order from 1 to n
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n+" ");
    }


    public static void main(String[] args) {
        int n = 5;
        printDec(n);
    }
}

//Output:
//(for printDec with n=5)
// 5
// 4
// 3
// 2
// 1

//(for printInc with n=5)
// 1
// 2
// 3
// 4    
// 5



// The function printDec prints numbers from n to 1 in decreasing order using recursion.
// Base case is when n equals 1, it prints 1 and returns.
// For other values of n, it prints n and calls itself with n-1.
// Each recursive call reduces n by 1 until it reaches the base case.

