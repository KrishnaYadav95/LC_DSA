class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        for(int i=0; i<nums.length ; i++){
              left[i]=leftsum;
              leftsum+=nums[i];
        }
        for(int i=0; i<nums.length ; i++){
            rightsum=0;
            for(int j=i+1;j<nums.length ; j++){
                rightsum+=nums[j];
                
            }
            right[i]=rightsum;
        }
        int[] res= new int[nums.length];
        for(int i=0; i< nums.length ; i++){
            res[i]= Math.abs(right[i]-left[i]);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna