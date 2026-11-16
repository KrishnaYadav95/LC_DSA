class Solution {
    public int aggressiveCows(int[] nums, int k) {
        // code here
        Arrays.sort(nums);
        int low=1;
        int min= Integer.MAX_VALUE;
        for(int i: nums) min=Math.min(min , i);
        int high=0;
        for(int i: nums) high=Math.max(high , i)-min;
        int ans= Integer.MIN_VALUE;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(canplace(nums , k , mid)){
                ans=Math.max(ans , mid);
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans==Integer.MIN_VALUE ? -1 : ans;
    }
    boolean canplace(int[] nums , int k , int mid){
        int count=1;
        int idx=0;
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i]-nums[idx])>=mid){
                count++;
                idx=i;
                if(count>=k) return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna