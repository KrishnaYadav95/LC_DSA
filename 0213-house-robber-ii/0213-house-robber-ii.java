class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp1= new int[nums.length+1];
        int[] dp2= new int[nums.length+1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2 , -1);
        return Math.max(helper(nums ,0 , dp1 , nums.length-2) , helper(nums, 1, dp2 , nums.length-1));
    }
    int helper(int[] nums , int i  , int[] dp , int end){
       //  if(nums.length==1) return nums[0];
        if(i==end) return nums[end];
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick= nums[i]+ helper(nums , i+2, dp , end);
        int skip= 0+ helper(nums , i+1 , dp , end);
        dp[i]= Math.max(pick , skip);
        return dp[i];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna