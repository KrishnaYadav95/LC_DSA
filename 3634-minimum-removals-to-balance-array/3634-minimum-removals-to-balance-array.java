class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        // 1 6 2 9
        // 1 2 6 9 
        int i=0;
        int j=0;
        int max=0;
        while(i<nums.length){
            while(j<nums.length && (long) nums[j]<=(long)nums[i]*k){
                j++;
            }
            // if this condition fails then calculate the max length 
            max=Math.max(max , j-i);
            i++;
        }
        return nums.length- max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna