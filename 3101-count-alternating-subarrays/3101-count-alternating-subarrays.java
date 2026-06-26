class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        int left=0;
        long ans=0;
        for(int right=1;right<nums.length;right++){
            if(nums[right]==nums[right-1]) {
                left=right;
                ans+=1;
            }
            else {
              ans+=right-left+1;
            }
        }
        return ans+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna