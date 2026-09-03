class Solution {
    public int uniquePathsWithObstacles(int[][] obs) {
        int[][] dp = new int[ obs.length][ obs[0].length];
        for(int [] i: dp) Arrays.fill( i,-1);
      return   path(obs , obs.length , obs[0].length , 0 , 0 , dp);
    }
    int path(int[][] obs , int m , int n , int i , int j, int[][]dp){
      
        if(i>=m || j>=n) return 0;
         
          if(obs[i][j]==1) return 0;
       if(i==m-1 && j==n-1) return 1;
       if(dp[i][j]!=-1) return dp[i][j];
       dp[i][j]= path(obs , m ,n, i+1 , j, dp) +  path(obs , m , n , i , j+1, dp);
        
        return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna