class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high=0;
        for(int i: nums){
            high=Math.max(high ,i);
        }
        int low=1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(isLesserThanThreshold(mid , nums, threshold)){
                high=mid-1;
                ans=Math.min(ans , mid);
            }else{
               // ans=(int)mid;
                low=mid+1;
            }
        }
        return ans;
    }
boolean isLesserThanThreshold(int mid , int[] nums , int threshold){
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum+= (int)Math.ceil((double)nums[i]/mid);
    }
    return sum<=threshold;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna