class Solution {
    public int findPages(int[] nums, int k) {
        // code here
        if(k>nums.length) return -1;
        long low=1;
        for(int i:nums) low=Math.max(low , i);
        long high=0;
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
        }
        long ans=Long.MAX_VALUE;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(canAssign(nums , k , mid)){
                high=mid-1;
                ans=Math.min(ans , mid);
            }else{
                low=mid+1;
            }
        }
        return ans == Long.MAX_VALUE ? -1 : (int)ans;
    }
    boolean canAssign(int[] nums , int k , long mid){
        long sum=0;
        int assign=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                assign++;
                if(assign>k) return false;
                sum=nums[i];
            }
            
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna