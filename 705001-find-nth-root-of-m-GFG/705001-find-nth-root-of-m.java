class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if(m==0) return 0;
        int low=1;
        int high= m;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(Math.pow(mid , n)==m) return mid;
            else if(Math.pow(mid , n)>m) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna