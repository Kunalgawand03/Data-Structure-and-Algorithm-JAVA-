package 26_Stack;
import java.util.Stack;

public class 6_StockSpan {
    public static void calculateStockSpan(int[] stocks, int[] spans) {
        Stack<Integer> stack = new Stack<>();
        spans[0] = 1; // Span for the first day is always 1
        stack.push(0); // Push index of the first day

        for (int i = 1; i < stocks.length; i++) {
            // Pop elements from stack while stack is not empty and top of stack is less than or equal to current price
            while (!stack.isEmpty() && stocks[stack.peek()] <= stocks[i]) {
                stack.pop();
            }

            // If stack becomes empty, then price is greater than all elements to the left
            if(stack.isEmpty()) {
                spans[i] = i + 1;
            } else {
                int prevHigh = stack.peek();
                spans[i] = i - prevHigh;
            }
            // Push this element's index to stack
            stack.push(i);
        }
        
    }

    public static void main(String args[]) {
        int[] stocks = {100, 80, 60, 70, 60, 75, 85};
        int n = stocks.length;
        int[] spans = new int[n];

        calculateStockSpan(prices, spans);

        System.out.println("Stock Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println("\nStock Spans: ");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}
