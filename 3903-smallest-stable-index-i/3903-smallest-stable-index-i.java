class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // find left maximum array
        List<Integer> list1= new ArrayList<>();
         int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
            list1.add(max);
            
        }
        // right minimum array 
         List<Integer> list2= new ArrayList<>();
         int min=nums[nums.length-1];
         for(int i=nums.length-1 ; i>=0;i--){
              min=Math.min(min, nums[i]);
            list2.add(0, min);
          
        }
        // 5 5 5 5 list1
        // 0 0 1 4 list2
        // now subtract list1-list2
        for(int i=0;i<list1.size();i++){
            int diff=list1.get(i)-list2.get(i);
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