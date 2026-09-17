class Solution {
    public int maxProfit(int[] prices) {
        int[][]dp = new int[prices.length+1][3];
        for(int[] i: dp) Arrays.fill(i,-1);
        return f(prices , 1, 0 , dp);
    }
    int f(int []nums , int buy , int idx , int[][] dp  ){
        if(idx>=nums.length){
            return 0;
        }
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==1){
        return dp[idx][buy]= Math.max(-nums[idx]+f(nums , 0, idx+1,dp )  , 0+f(nums , 1, idx+1,dp));
        }
        return dp[idx][buy]= Math.max(nums[idx]+f(nums , 1, idx+2, dp) , 0+f(nums , 0 , idx+1, dp));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna