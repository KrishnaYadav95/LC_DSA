class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        subset(nums, 0 , list, ans );
       
        return ans;
    }
    void subset(int[] nums , int idx , List<Integer> list , List<List<Integer>> ans){

        if(idx==nums.length){
        
           if(!ans.contains(list))
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(idx>=nums.length){
            return ;
        }

        // pick it 
       
         list.add(nums[idx]);
         subset(nums, idx+1  , list , ans );
         list.remove(list.size()-1);
        
         // skip it 
         subset(nums, idx+1 , list, ans );
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna