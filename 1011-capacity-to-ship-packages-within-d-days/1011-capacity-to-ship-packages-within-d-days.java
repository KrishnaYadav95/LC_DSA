class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i: weights){
            high+=i;
            low=Math.max(low, i);
        }
        
      //  int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid , weights , days)){
                high=mid-1;
                //ans=Math.min(ans , mid);
            }else{
                low=mid+1;
            }
        }
        return low;
    }
boolean isPossible(int mid , int[] nums , int days){ 
    int requiredDays= 1;
    int sum=0;
    for(int i=0;i<nums.length;i++){

        if(sum+nums[i]>mid){
            requiredDays++;
            sum=0;
        }
        sum+=nums[i];
    }
    return requiredDays<=days;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna