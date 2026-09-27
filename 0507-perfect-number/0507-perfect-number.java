class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++)
         if(num%i==0) sum+=i;
        return sum==num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna