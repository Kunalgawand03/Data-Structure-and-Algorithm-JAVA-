package GreedyAlgo;
import java.util.*;

public class 6_IndianCoins {
    public static void main(String[] args) {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder()); // Sort coins in descending order

        int amount = 590; // Example amount
        int coinCount = 0;
        List<Integer> usedCoins = new ArrayList<>();

        for(int i=0; i < coins.length; i++) {
            while(amount >= coins[i]) {
                amount -= coins[i];
                coinCount++;
                usedCoins.add(coins[i]);
            }
        }

        System.out.println("Minimum number of coins required = " + coinCount);
        System.out.println("Coins used: " + usedCoins);
    }
}

// Example Output:
// Minimum number of coins required = 5 
// Coins used: [500, 50, 20, 10, 10]
