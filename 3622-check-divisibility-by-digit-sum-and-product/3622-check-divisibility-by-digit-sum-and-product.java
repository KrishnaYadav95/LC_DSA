class Solution {
    public boolean checkDivisibility(int n) {
        int prd=1;
        int sum=0;
        int og=n;
        while(n>0){
            prd*=n%10;
            sum+=n%10;
            n=n/10;
        }
        return og%(sum+prd)==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna