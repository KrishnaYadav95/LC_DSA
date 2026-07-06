class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        // we need to sort the array first to handle duplicates
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        combination(nums , 0 , 0 , target, list , ans);
        return ans;
    }
    void combination(int[] nums , int idx, int sum , int target , List<Integer> list , List<List<Integer>> ans){
        // Base case
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum> target|| idx>=nums.length){
            return ;
        }
        // case-1 pick it
        list.add(nums[idx]);
        sum+=nums[idx];
        combination(nums, idx+1 , sum , target , list , ans);
        list.remove(list.size()-1);
        sum-=nums[idx];

        while(idx<nums.length-1 && nums[idx]==nums[idx+1]) idx++;

        //case-2 Dont pick it
        combination(nums, idx+1 , sum , target , list , ans);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna