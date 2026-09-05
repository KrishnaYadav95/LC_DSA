class Solution {
// int count=0;
    public int countPartitions(int[] arr, int diff) {
        // code here
        int totalsum=0;
        for(int i:arr) totalsum+=i;
        int[][] dp= new int[arr.length+1][totalsum+1];
        for(int []i: dp) Arrays.fill(i,-1);
       return count(arr, 0, 0, totalsum, diff, dp);
        //return count;
    }
    int count(int[] arr , int idx , int sum, int totalsum , int diff, int[][] dp){
     if(idx>=arr.length){
      int f=  totalsum-sum;
        if(sum-f==diff){
           return 1;
        }
        return 0;
     }
       if(dp[idx][sum]!=-1) return dp[idx][sum];
    dp[idx][sum]= count(arr, idx+1, sum+arr[idx] , totalsum , diff , dp)+ count(arr, idx+1 , sum , totalsum, diff , dp);
    return dp[idx][sum];
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna