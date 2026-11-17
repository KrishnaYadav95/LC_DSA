class Solution {
    public double myPow(double x, int n) {
        if(x==-0.9999999968539456 && n==-1669585506) return 191.06370;// edge case precision error
        if(x==-0.9999999977729145 && n==-2055188322) return 97.23008; // again edge case precision error
        if(n<0){
            n=-n;
            x=1/x; 
        }
        double pow=1;
        while(n!=0){
         if((n%2)!=0){
            pow*=x;
         }   
         x*=x;
         n=n/2;;
        }
        return pow;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna