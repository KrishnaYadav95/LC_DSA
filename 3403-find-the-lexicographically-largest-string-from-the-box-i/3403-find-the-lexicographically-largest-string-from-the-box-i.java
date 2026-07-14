class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1) return word;
        int n= word.length();
        int m= n-numFriends+1;
        String res="" ;
        String curr= "";
        for(int i=0;i<n;i++){
            curr= word.substring(i, Math.min(i+m , n));
            if(res.compareTo(curr)<0) res=curr;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna