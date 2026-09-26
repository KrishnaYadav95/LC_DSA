class Solution {
    public int maxSumAfterPartitioning(int[] nums, int k) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp , -1);
        return f(nums , 0 , k , nums.length , dp);
    }
    int f(int[] nums , int i , int k, int n , int[] dp){
        if(i==n) return 0;
        if(dp[i]!=-1) return dp[i];
        int sum=0;
        int max=0;
        int len=0;
        int ans=Integer.MIN_VALUE;
        for(int j=i;j<i+k &&j<n ;j++){
            len++;
             max= Math.max(max , nums[j]);
            sum= max*len+ f(nums , j+1 , k ,n, dp);
            ans=Math.max(ans , sum);
        }
        
        return dp[i]=ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna