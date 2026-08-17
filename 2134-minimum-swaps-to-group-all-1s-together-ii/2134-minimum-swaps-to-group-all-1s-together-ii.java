class Solution {
    public int minSwaps(int[] nums) {
        int countOnes=0;
        for(int i:nums){
            if(i==1) countOnes++;
        }
        int windowSize=countOnes;
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        int count=0;
        while(j<2*nums.length){
            if(nums[j%nums.length]==0) count++;
             while(j-i+1> windowSize){
                if(nums[i%nums.length]==0){
                    count--;
                }
                i++;
            }
            if(j-i+1== windowSize){
                min=Math.min(count,min);
            }
           
            j++;
        }
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna