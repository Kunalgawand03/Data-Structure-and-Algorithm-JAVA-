package RecursionPart1;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0|| n == 1) {
            return n; // Base case: Fibonacci(0) = 0, Fibonacci(1) = 1
        }   
        int smallerFibonacci1 = fibonacci(n - 1); // Recursive call for (n-1)
        int smallerFibonacci2 = fibonacci(n - 2); // Recursive call for (n-2)
        int result = smallerFibonacci1 + smallerFibonacci2; // Calculate Fibonacci
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fibonacci(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}

//Output:
// Fibonacci of 5 is: 5

