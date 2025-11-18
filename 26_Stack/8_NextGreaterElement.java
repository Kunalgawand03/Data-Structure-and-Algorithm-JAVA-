package Stack;
import java.util.Stack;

public class 8_NextGreaterElement {
    public static void findNextGreaterElements(int[] arr, int[] nxtGreater) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements from stack while stack is not empty and top of stack is less than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack becomes empty, then there is no greater element to the right
            if (stack.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = stack.peek();
            }

            // Push this element to stack
            stack.push(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {6 , 8 , 0 , 1 , 3};
        int n = arr.length;
        int[] nxtGreater = new int[n];

        findNextGreaterElements(arr, nxtGreater);

        System.out.println("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nNext Greater Elements: ");
        for (int element : nxtGreater) {
            System.out.print(element + " ");
        }
    }
}

// Output:
// Array:
// 6 8 0 1 3
// Next Greater Elements:
// 8 -1 1 3 -1
