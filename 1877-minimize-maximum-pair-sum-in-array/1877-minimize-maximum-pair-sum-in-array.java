class Solution {
    public int minPairSum(int[] nums) {
        // 2 3 4 4 5 6 
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int sum=0;
        int maxsum=0;
        while(i<j){
            sum=nums[i]+nums[j];
            maxsum=Math.max(sum , maxsum);
            i++;
            j--;
        }
        return maxsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna