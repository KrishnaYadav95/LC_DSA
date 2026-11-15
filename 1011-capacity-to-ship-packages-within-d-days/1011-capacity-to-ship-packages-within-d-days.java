class Solution {
    public int shipWithinDays(int[] nums, int days) {
        // high will be the sum of all weights
        int high=0;
        for(int i:nums) high+=i;
        int low = 1;
        for(int i : nums) low = Math.max(low, i);
        int ans= Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canship(nums , days , mid)){
                ans=Math.min(ans , mid);
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans==Integer.MAX_VALUE? -1: ans;
    }
    boolean canship(int[] nums , int days , int mid){
        int sum=0;
        int countdays=1;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
            if(sum>mid){
                countdays++;
                 if(countdays>days) return false;
                sum=nums[i];
            }
            
           
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna