class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        // sum should be evem , odd cannot be divided into 2
        if(sum%2!=0) return false;
        Boolean[][] dp= new Boolean[nums.length+1][sum/2+1];
        
        return sum(nums, 0, 0, sum, dp);
    }
    boolean sum(int[] nums  , int idx , int sum , int totalsum , Boolean[][] dp){
        if(sum==totalsum/2){
            return true;
        }
        if(idx >= nums.length || sum > totalsum / 2){
        return false;
        }
        if(dp[idx][sum]!=null) return dp[idx][sum];
        boolean pick= sum(nums , idx+1 ,sum+nums[idx] , totalsum,dp);
        boolean skip= sum(nums , idx+1, sum , totalsum, dp);
       return dp[idx][sum]= pick||skip;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna