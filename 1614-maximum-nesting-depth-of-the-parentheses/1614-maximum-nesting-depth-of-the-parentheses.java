class Solution {
    public int maxDepth(String s) {
        int count1=0;
        int count2=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count1++;
            if(s.charAt(i)==')'){
                count2++;
                max=Math.max(count1-count2+1 , max);
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna