class Solution {
    int minCost(int[] height) {
        // code here
        int[] dp= new int[height.length+1];
        Arrays.fill(dp , -1);
        return helper(height , height.length-1, dp);
    }
    int helper(int[] nums , int index , int[] dp){
        if(index==0) return 0;
        if(dp[index]!=-1) return dp[index];
        int left = helper(nums , index-1, dp) + Math.abs(nums[index]-nums[index-1]);
         int right = Integer.MAX_VALUE; 
        if(index>1)
         right= helper(nums , index-2 ,dp) + Math.abs(nums[index] -nums[index-2]);
       dp[index]= Math.min(left, right);
       return dp[index];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna