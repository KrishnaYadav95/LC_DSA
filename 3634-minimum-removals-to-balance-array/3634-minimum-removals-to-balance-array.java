class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        // 1 2 6 9 
        int i=0;
        int j=0;
        int n=nums.length;
        int max=0;
        while(i<n){
            while( j<n && (long)nums[j]<=(long) nums[i]*k){
                j++;
            }
            i++;
            max=Math.max(max, j-i+1);
        }
        return n-max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna