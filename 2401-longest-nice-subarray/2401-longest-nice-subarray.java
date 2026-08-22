class Solution {
    public int longestNiceSubarray(int[] nums) {
        int i=0;
        int j=0;
        int max=1;
        int mask=0;
        while(j<nums.length){
           while((mask & nums[j])!=0){
            mask= (mask ^ nums[i]);
            i++;
           }
           max= Math.max(max, j-i+1);
           mask= (mask|nums[j]);
           j++;
        }
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna