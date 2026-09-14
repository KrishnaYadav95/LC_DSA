class Solution {
    public int minInsertions(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int [] i: dp) Arrays.fill(i, -1);
        return s.length()- f(s, 0 , s.length()-1 , dp);

    }
    int f(String s , int i, int j, int[][] dp){
        if(i>j) return 0;
        if(i==j) return dp[i][j]=1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]= 2+ f(s, i+1 , j-1 , dp);
        }else{
            dp[i][j]= Math.max(f(s, i+1 ,j, dp) , f(s, i, j-1 , dp));
        }
        return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna