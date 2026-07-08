class Solution {
    public int longestOnes(int[] nums, int k) {
        int  i=0;
        int count=0;
        int maxlength=0;
        for(int j=0;j<nums.length;j++){
             if(nums[j]==0){
                count++;
             }

             if(count>k){
                if(nums[i]==0) count--;
                i++;
             }
          if(count<=k){
            maxlength=Math.max(maxlength , j-i+1);
          }
        }
        return maxlength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna