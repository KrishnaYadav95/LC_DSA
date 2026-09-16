class Solution {

    public int maxProfit(int[] prices) {
        Integer[][][] dp = new Integer[prices.length][2][3];
        return f(0, 1, 2, prices, prices.length, dp);
    }

    int f(int ind, int buy, int cap, int[] prices, int n, Integer[][][] dp) {

        if (ind == n || cap == 0)
            return 0;

        if (dp[ind][buy][cap] != null)
            return dp[ind][buy][cap];

        if (buy == 1) {
            return dp[ind][buy][cap] = Math.max(
                -prices[ind] + f(ind + 1, 0, cap, prices, n, dp),
                f(ind + 1, 1, cap, prices, n, dp)
            );
        }

        return dp[ind][buy][cap] = Math.max(
            prices[ind] + f(ind + 1, 1, cap - 1, prices, n, dp),
            f(ind + 1, 0, cap, prices, n, dp)
        );
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna