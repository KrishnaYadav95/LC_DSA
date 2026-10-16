class Solution {
    public int trap(int[] height) {
        int[] left= ngl(height);
        int[] right=ngr(height);
        int water=0;
        for(int i=0;i<left.length;i++){
            water+= Math.min(left[i], right[i])-height[i];
        }
        return water;
    }
    int[] ngl(int[] nums){
        int[] temp= new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>max){
                temp[i]=nums[i];
                max=nums[i];
            }
            else{
                temp[i]=max;
            }
        }
        return temp;
    }
    int[] ngr(int[] nums){
        int[] temp= new int[nums.length];
        int max=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>max){
                temp[i]=nums[i];
                max=nums[i];
            }else{
                temp[i]=max;
            }
        }
        return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna