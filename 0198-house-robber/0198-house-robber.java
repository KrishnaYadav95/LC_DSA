class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp , -1);
        return helper(nums , nums.length , dp);
    }
    int helper(int[] nums , int i , int[] dp){
        if(i<=0) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick= helper(nums , i-2 , dp ) + nums[i-1];
        int skip= helper(nums , i-1 , dp );
        dp[i] =Math.max(pick , skip);
         return dp[i];
    }
} 

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna