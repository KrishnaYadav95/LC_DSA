class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<Integer> list= new ArrayList<>();
    List<List<Integer>> ans= new ArrayList<>();
    combination(nums, 0 , target,0 ,list, ans);
    return ans;
    }
    void combination(int[] nums , int idx , int target , int sum , List<Integer> list , List<List<Integer>> ans){

        // base case
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return ; 
        }
        if(idx>=nums.length|| sum>target){
            return ; 
        }


        // pick it 
        list.add(nums[idx]);
        sum+=nums[idx];
        // we can pick nums[i] multiple times so i removed idx+1
        combination(nums , idx , target, sum , list , ans);
        list.remove(list.size()-1);
        sum-=nums[idx];

        // dont pick it
        combination(nums, idx+1 , target, sum , list , ans);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna