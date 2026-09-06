class Solution {
    //int count=0;
    public int numDistinct(String s, String t) {
        int[][]dp= new int[s.length()][t.length()];
        for(int []i:dp) Arrays.fill(i, -1);
      return  count(s, 0,0, t,dp);
      //  return count;
    }
    int count(String s, int i,int j,  String t, int[][]dp){
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;
      
        if(dp[i][j]!=-1) return dp[i][j];
       if(s.charAt(i)==t.charAt(j)){
        dp[i][j]= count(s, i+1, j+1, t, dp) + count(s, i+1, j, t, dp);
       }else{
        dp[i][j]= count(s, i+1, j ,t, dp);
       }
       return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna