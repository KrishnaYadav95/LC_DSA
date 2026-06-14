class Solution {
    public int search(int[] nums, int target) {
      //  [8,9,10,1,2,3,4,5,6,7] target=5
      int ans=-1;
      int low= 0;
      int high= nums.length-1;
     
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target){
             return mid;
            }
            if(nums[mid]>=nums[low]){
            if(target>=nums[low] && target<nums[mid]){
                high= mid-1;
            }else{
                low=mid+1;
            }
            }else{
                 if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
      return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna