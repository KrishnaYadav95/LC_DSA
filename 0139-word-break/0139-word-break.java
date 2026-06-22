class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet<String> set= new HashSet<>(wordDict);
        boolean [] dp = new boolean[s.length()+1];
        dp[0]=true; // empty string is always valid
        for(int i=0;i<s.length();i++){
            if(dp[i]==false) continue;
            for(int j=i+1; j<=s.length();j++){
             if(set.contains(s.substring(i , j))) 
             dp[j]=true;
            }
        }
        return dp[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna