class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m+1][n+1];
        for(int [] row : dp) Arrays.fill(row , -1);
       return paths(m , n, 0 , 0 , dp);
    }
    int paths(int m  ,int n , int i, int j , int[][] dp){
        if(i==m-1 && j==n-1){
           return 1;
        }
        if(i>=m || j>=n) return 0 ;

        if(dp[i][j]!=-1) return dp[i][j];
      dp[i][j]=  paths(m , n , i+1 , j , dp) + paths(m , n, i , j+1 , dp);

       return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna