class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[][] dp = new int[n+1][n+1];
        for(int[] i: dp) Arrays.fill(i, -1);
        return f(nums , 0 , -1 , dp);
    }
     int f(int[] nums  , int idx , int previdx  , int[][] dp){
        if(idx>=nums.length) return 0;
        
         if(dp[idx][previdx+1]!=-1) return dp[idx][previdx+1];

         // skip 
        int len=  0+f(nums , idx+ 1 , previdx , dp);

        if(previdx==-1 || nums[idx]>nums[previdx]){
             len= Math.max( len , 1+f(nums , idx+1 , idx , dp));
        }
        
        return dp[idx][previdx+1]=len;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna