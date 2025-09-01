package RecursionPart1;

public class SumOfN {
    public static int sum(int n) {
        if (n == 1) {
            return 1; // Base case: sum of first 0 natural numbers is 0
        }
        int smallerSum = sum(n - 1); // Recursive call
        int totalSum = n + smallerSum; // Calculate sum
        return totalSum;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}

//Output:
// Sum of first 5 natural numbers is: 15
