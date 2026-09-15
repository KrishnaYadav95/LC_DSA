class Solution {
    public int minDistance(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int [] i: dp) Arrays.fill(i, -1);
        return f(s1, s2, s1.length()-1 , s2.length()-1 , dp);
    }
    int f(String s1, String s2, int i, int j , int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]= f(s1, s2, i-1 , j-1 , dp);
        }else{
            dp[i][j]=1+ Math.min(f(s1, s2, i-1 , j, dp) , Math.min( f(s1 , s2, i, j-1 , dp) , f(s1,s2, i-1, j-1 , dp) ));
        }
        return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna