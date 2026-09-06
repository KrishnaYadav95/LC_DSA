class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];

        for (int[] i : dp)
            Arrays.fill(i, -1);

        int ans = count(coins, 0, amount, dp);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    int count(int[] coins, int idx, int amount, int[][] dp) {

        if (amount == 0)
            return 0;

        if (amount < 0 || idx >= coins.length)
            return Integer.MAX_VALUE;

        if (dp[idx][amount] != -1)
            return dp[idx][amount];

        int take = count(coins, idx, amount - coins[idx], dp);

        if (take != Integer.MAX_VALUE)
            take = 1 + take;

        int skip = count(coins, idx + 1, amount, dp);

        return dp[idx][amount] = Math.min(take, skip);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna