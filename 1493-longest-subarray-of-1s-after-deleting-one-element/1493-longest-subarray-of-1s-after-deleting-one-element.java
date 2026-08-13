class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while(j<nums.length){
            if(nums[j]==0){
                count++;
            }
            while(count>1){
                if(nums[i]==0) count--;
                i++;
            }
           
                max=Math.max(max, j-i);
              
            j++;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna