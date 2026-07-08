class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int maxcount=0;
        int zeroes=0;
        for(int j=0;j<nums.length ; j++){
            if(nums[j]==0){
                zeroes++;
            }
            if(zeroes>k){
                  if(nums[i]==0) zeroes--;// condition should be checked first before incrementing i because if ith number is 0 then i will move forwrd and count-- may not happen
                i++;
              
            }
            // only count maxlength when number of zeroes is less than k otherwise u will get wrong maxlength 
            if(zeroes<=k){
                maxcount=Math.max(maxcount , j-i+1);
            }
        }
        return maxcount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna