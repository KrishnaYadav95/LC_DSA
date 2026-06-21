class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list  = new ArrayList<>();
        perm(nums  , ans , list);
        return ans;
    }
    void perm(int[] nums ,List<List<Integer>> ans , List<Integer> list){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0 ;i<nums.length; i++){
            if(!list.contains(nums[i])){
            list.add(nums[i]);
            perm(nums  , ans , list);
            list.remove(list.size()-1);
        }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna