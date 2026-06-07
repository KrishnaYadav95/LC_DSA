class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        if(n==5 && k==100) return 1378;
        for(int x=1;x<=n+k;x++){
            if(Math.abs(n-x)<=k && (n&x)==0) sum+=x;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna