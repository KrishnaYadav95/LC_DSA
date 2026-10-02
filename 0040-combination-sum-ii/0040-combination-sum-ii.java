class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       Arrays.sort(candidates); 
       List<List<Integer>> ans= new ArrayList<>();
       List<Integer> list = new ArrayList<>();
       boolean [] flag= new boolean[candidates.length+1];
       f(candidates , 0 , target , list, ans , 0 );
       return ans;
    }
    void f(int[] nums , int idx , int target , List<Integer> list , List<List<Integer>> ans , int sum ){

         if(sum==target){
            ans.add(new ArrayList<>(list));
            return ;
        }
       
        if(idx>=nums.length|| sum>target){
            return ;
        }
       
        list.add(nums[idx]);
        sum+=nums[idx];
        f(nums , idx+1 , target , list , ans, sum);
        list.remove(list.size()-1);
        sum-=nums[idx];
      while(idx+1 < nums.length && nums[idx]==nums[idx+1]) idx++;
        
        f(nums , idx+1 , target , list, ans , sum);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna