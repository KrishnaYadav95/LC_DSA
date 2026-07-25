class Solution {
    public int maxProduct(int n) {
        String s= Integer.toString(n);
        int max=0;
        int secmax=0;
        for(int i=0;i<s.length();i++){
            int ch= s.charAt(i)-'0';
           if(ch>=max){
            secmax=max;
            max=ch;
           }else if (ch > secmax) {
                secmax = ch;
            }
        }
        return secmax*max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna