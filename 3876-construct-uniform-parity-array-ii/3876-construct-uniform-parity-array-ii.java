class Solution {
    public boolean uniformArray(int[] nums1) {
        if(AllEven(nums1)) return true;
        if(AllOdd(nums1)) return true;
        int temp=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                temp=Math.min(temp , nums1[i]);
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                if(temp>nums1[i]) return false;
                nums1[i]=nums1[i]-temp;
            }
        }
        if(AllOdd(nums1)) return true;
        return false;
    }
    boolean AllEven(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) return false;
        }
        return true;
    }
    boolean AllOdd(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna