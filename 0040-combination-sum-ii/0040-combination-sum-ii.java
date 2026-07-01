class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
        List<Integer> list= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        combination(candidates , 0 , list , ans , target , 0);
        return ans;
    }
    void combination(int[] nums , int idx , List<Integer> list , List<List<Integer>> ans , int target , int sum){

        if(sum==target){
            ans.add(new ArrayList<>(list));
            return ;
        }
     
        if(idx >=nums.length){
            return ;
        }
        if(sum > target){
            return ;
        }
    
        // pick -> unique picks allowed
        list.add(nums[idx]);
        sum+=nums[idx];
        combination(nums , idx+1 , list, ans , target , sum);
        list.remove(list.size()-1);
        sum-=nums[idx];
        
        // to avoid duplicates 
        while(idx+1<nums.length && nums[idx]==nums[idx+1]) idx++;

        // dont pick
        combination(nums , idx+1 , list, ans , target , sum);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna