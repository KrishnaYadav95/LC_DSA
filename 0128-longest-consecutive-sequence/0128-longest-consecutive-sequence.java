class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1) return 1;
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        // 1 2 3 4 100 200
        int count=1;
        int max=1; 
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) {
            count++;
           max=Math.max(max , count);
            }
            else if(nums[i]==nums[i-1]) continue;
            else{
                max=Math.max(max , count);
                count=1;
                
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna