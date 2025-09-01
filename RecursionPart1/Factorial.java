package RecursionPart1;

public class Factorial {
    public static int factorial(int n) {
        if(n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }

        int smallerFactorial = factorial(n - 1); // Recursive call
        int factorial = n * smallerFactorial; // Calculate factorial
        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}

//Output:
// Factorial of 5 is: 120
// The function factorial computes the factorial of a given number n using recursion.
// Base case is when n equals 0, it returns 1.
// For other values of n, it calls itself with n-1 and multiplies the result by n.
// Each recursive call reduces n by 1 until it reaches the base case.

