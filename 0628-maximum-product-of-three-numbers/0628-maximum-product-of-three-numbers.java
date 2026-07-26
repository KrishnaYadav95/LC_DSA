class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mult=1;
       
        for(int i=n-1;i>=n-3;i--){
             mult = mult*nums[i];
        }
        for(int i=0;i<n;i++){
             if(nums[0]*nums[1]*nums[n-1]>mult){
            mult=nums[0]*nums[1]*nums[n-1];
         }
        }

            
        
        return mult;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna