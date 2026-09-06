class Solution {
    // int count=0;
    public int change(int amount, int[] coins) {
        int[][]dp= new int[coins.length][amount];
        for(int[] i: dp) Arrays.fill(i, -1);
       return count(coins, 0, amount,0, dp);
       // return count;
    }
    int count(int[] coins , int idx , int amount, int sum , int[][]dp){
        if(sum==amount){
            return 1;
        }
        if(sum>amount|| idx>=coins.length){
            return 0 ;
        }
        if(dp[idx][sum]!=-1) return dp[idx][sum];
        dp[idx][sum]=count(coins , idx , amount, sum+coins[idx], dp)+count(coins, idx+1 , amount , sum , dp);
        return dp[idx][sum];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna