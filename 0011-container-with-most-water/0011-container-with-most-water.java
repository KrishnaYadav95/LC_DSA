class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int sum=0;
        int max=0;
        while(i<=j){
            sum= (j-i)*Math.min(nums[i], nums[j]);
            max=Math.max(max , sum);
         if(nums[i]>=nums[j]){
            j--;
         }else i++;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna