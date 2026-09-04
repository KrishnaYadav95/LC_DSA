class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // find left maximum array
    int[] arr1= new int[nums.length];
         int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
           arr1[i]=max;
            
        }
        // right minimum array 
         int[] arr2= new int[nums.length];
         int min=nums[nums.length-1];
         for(int i=nums.length-1 ; i>=0;i--){
              min=Math.min(min, nums[i]);
            arr2[i]=min;
          
        }
        // 5 5 5 5 list1
        // 0 0 1 4 list2
        // now subtract list1-list2
        for(int i=0;i<arr1.length;i++){
            int diff=arr1[i]-arr2[i];
            if(diff<=k){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna