class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int maxcount=0;
        for(int j=0;j<nums.length ; j++){
            if(nums[j]==0){
               // maxcount=Math.max(maxcount , j-i+1);
                i=j+1;
            }else
              maxcount=Math.max(j-i+1 , maxcount);
        }
      
        return maxcount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna