class Solution {
    public int gcdOfOddEvenSums(int n) {
        int  evensum=0;
        int  oddsum=0;
        for(int i=1; i<=2*n ;i++){
            if(i%2==0) evensum+=i;
            else oddsum+=i;
        }
        int k= gcd(evensum , oddsum);
        return k;
    }
    int gcd(int a , int b){
        while(b>0){
            int temp=b;
               b=a%b;
            a=temp;
         
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna