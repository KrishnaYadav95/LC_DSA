class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int low=1;
        int high=x;
        int ans=-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if((long)mid*mid==x) return mid;
            else if ((long)mid*mid >x){
                high=mid-1;
            }else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna