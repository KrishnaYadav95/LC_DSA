class Solution {
    public boolean checkValidString(String s) {
        Boolean[][] dp = new  Boolean[s.length()][s.length()];
       // for(int [] i: dp) Arrays.fill(dp , -1);
        return f(s, 0 ,0 , dp);
    }
    boolean f(String s , int idx , int count , Boolean[][] dp){
        if(count<0) return false;

        if(idx==s.length()) return count==0;
        if(dp[idx][count]!=null) return dp[idx][count];
        if(s.charAt(idx)=='('){
            return dp[idx][count]= f(s , idx+1 , count+1 , dp);
        }
        if(s.charAt(idx)==')'){
            return dp[idx][count]=  f(s, idx+1 , count-1 , dp);
        }
      else{
            return dp[idx][count]= f(s , idx+1 , count+1 , dp) || f(s, idx+1 , count-1 , dp) || f(s, idx+1 , count,dp);
        }
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna