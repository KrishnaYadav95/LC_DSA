class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] flag= new boolean[candidates.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        sum(candidates, 0 , target , list, ans );
        return ans;
    }
    void sum(int[] nums ,int idx , int target , List<Integer> list , List<List<Integer>> ans ){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(idx==nums.length){
            return ;
        }
        
       for(int i=idx;i<nums.length;i++){
         if(i>idx && nums[i]==nums[i-1]){
            continue;
        }
            if(nums[i] > target)
           break;

        list.add(nums[i]);
        sum(nums , i+1,target-nums[i] , list , ans );
        list.remove(list.size()-1);
       
       
       }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna