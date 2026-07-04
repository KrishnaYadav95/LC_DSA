class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max=0;
        int pairsum=0;
        for(int i=k;i<nums.length; i++){
            max= Math.max(max , nums[i-k]);
            pairsum= Math.max(pairsum , max+ nums[i]);
        }
        return pairsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna