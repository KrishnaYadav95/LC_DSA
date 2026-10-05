class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPallindrome(s.substring(i, j+1))){
                    max=Math.max(j-i+1 , max);
                    if(max>sb.length()){
                       sb.setLength(0);
                    sb.append(s.substring(i, j+1));
                    }
                }
            }
        }
        return sb.toString();
    }
    boolean isPallindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna