class Solution {
    public int minPathSum(int[][] grid) {
       int[][] dp = new int[ grid.length][ grid[0].length];
       for(int [] i: dp) Arrays.fill( i,-1);
      return paths(grid , grid.length , grid[0].length , 0 , 0 , 0 , dp);
    
    }
    int  paths(int[][] grid , int m , int n , int i, int j, int sum , int[][]dp){
        if(i>=m || j>=n) return Integer.MAX_VALUE ;

        if(i==m-1 &&j==n-1){
            return grid[i][j];
        }
    if(dp[i][j]!=-1) return dp[i][j];
    
      int down=  paths(grid, m , n, i+1 , j, sum, dp);
      int right= paths(grid, m, n , i, j+1 , sum, dp);
      dp[i][j]= grid[i][j] + Math.min(down , right);
      return dp[i][j];
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna