class Solution {
    public int minCostClimbingStairs(int[] cost) {
       
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp , -1);
         return helper(cost, cost.length ,  dp);
    }

    int helper(int[] cost, int idx , int[] dp) {
        if (idx == 0 || idx == 1) return 0;
 if(dp[idx]!=-1) return dp[idx];
        int step1 = helper(cost, idx - 1, dp) + cost[idx - 1];
        int step2 = helper(cost, idx - 2 , dp) + cost[idx - 2];

        dp[idx]= Math.min(step1, step2);
        return dp[idx];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna