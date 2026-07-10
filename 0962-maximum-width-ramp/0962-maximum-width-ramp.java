class Solution {
    public int maxWidthRamp(int[] nums) {
       int[] rightmax= new int[nums.length];
       int n=nums.length;
       rightmax[n-1]= nums[n-1];
       for(int i=n-2;i>=0;i--){
        rightmax[i]= Math.max(rightmax[i+1] , nums[i]);
       }
       int max=0;
       int i=0;
       int j=0;
       while(j<n){
        while(i<j && nums[i]> rightmax[j]){
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