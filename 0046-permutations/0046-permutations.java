class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list  = new ArrayList<>();
        boolean [] flag= new boolean[nums.length];
        perm(nums , flag , ans , list);
        return ans;
    }
    void perm(int[] nums , boolean[] flag ,List<List<Integer>> ans , List<Integer> list){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0 ;i<nums.length; i++){
            if(flag[i]) continue;
          flag[i]=true;
            list.add(nums[i]);
            perm(nums , flag  , ans , list);
            list.remove(list.size()-1);
            flag[i]=false;

        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna