import java.util.HashMap;
import java.util.Map;

public class CoinChange {

    // Method to calculate minimum number of coins and print the result
    public static void minCoins(int[] coins, int amount) {
        int count = 0;  // Total number of coins used
        Map<Integer, Integer> coinCount = new HashMap<>();  // To store coin types and their counts

        // Loop through coins starting from the largest
        for (int i = coins.length - 1; i >= 0; i--) {
            // While the amount is greater than or equal to the current coin denomination
            while (amount >= coins[i]) {
                // Subtract coin value from amount and increment total coin count
                amount -= coins[i]; // amount = amount-coins[i] //
                count++;

                // Update the coin count for the current denomination
                coinCount.put(coins[i], coinCount.getOrDefault(coins[i], 0) + 1);
            }
        }

        // Print the total number of coins used
        System.out.println("Total coins used: " + count);

        // Print the types of coins used and their counts
        System.out.println("Coins used:");
        for (Map.Entry<Integer, Integer> entry : coinCount.entrySet()) {
            System.out.println("Coin of " + entry.getKey() + " : " + entry.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        // Coin denominations
        int[] coins = {1, 5, 10, 25};
        
        // Amount to be changed
        int amount = 66;
        
        // Call the method to calculate and display the coin counts
        minCoins(coins, amount);  // Output: 6 coins: 2 of 25, 1 of 10, 1 of 5, 3 of 1
    }
}

