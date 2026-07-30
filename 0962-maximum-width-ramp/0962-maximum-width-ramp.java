class Solution {
    public int maxWidthRamp(int[] nums) {
        int[] rightmax= new int[nums.length];
        int n=nums.length;
        rightmax[n-1]=nums[n-1];
        for(int k=n-2;k>=0;k--){
            rightmax[k]=Math.max(nums[k] , rightmax[k+1]);
        }
        int i=0;
        int j=0;
        int maxwidth=0;
        while(j<nums.length){
            while( i<j && nums[i]>rightmax[j]){
                i++;
            }
      
            maxwidth=Math.max(maxwidth ,j-i);
                    j++;
        }
        return maxwidth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna