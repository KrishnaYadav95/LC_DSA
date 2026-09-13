class Solution {
    int max=0;
    public int longCommSubstr(String s1, String s2) {
        // code here
        int[][]dp= new int[s1.length()+1][s2.length()+1];
        for(int [] i: dp) Arrays.fill(i, -1);
         f(s1, s2, s1.length()-1, s2.length()-1 , dp );
         return max;
    }
    int f(String s1 , String s2 , int i, int j , int[][] dp ){
        if(i<0 || j<0) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]= 1+ f(s1, s2, i-1, j-1, dp);
            max= Math.max(dp[i][j] , max);
        }else{
            dp[i][j]=0;
            
        }
        f(s1, s2, i-1, j, dp);
            f(s1, s2, i, j-1, dp);
         return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna