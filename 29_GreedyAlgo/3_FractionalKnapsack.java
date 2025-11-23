package GreedyAlgo;
import java.util.*;

public class 3_FractionalKnapsack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;

        double ratio[][] = new double[values.length][2];
        // ratio[i][0] -> index, ratio[i][1] -> value/weight

        for (int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i] / (double)weights[i];
        }
        
        // Sort the ratio array based on value/weight in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        
        // Greedily add items to the knapsack
        int finalValue = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weights[idx]) {
                finalValue += values[idx];
                capacity -= weights[idx];
            } else {
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum value in Knapsack = " + finalValue);
    }
}
