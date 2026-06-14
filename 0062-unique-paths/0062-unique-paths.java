class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp= new int[m+1][n+1];
         for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return paths(m , n, 0 , 0 , dp);
    }
    int paths(int row , int col , int m , int n , int[][]dp){
        if(m==row-1 || n==col-1){
        return 1;
        }
        if(dp[m][n]!=-1) return dp[m][n];
       dp[m][n]= paths(row , col , m+1 , n , dp) + paths(row , col, m, n+1 ,dp);
       return dp[m][n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna