class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {

    // There is one more way to avoid duplicate in this problem since flag is not working we have to sort the array first ..

    // we can remove the boolean flag array since it is useless.. now
    Arrays.sort(nums);

         List<List<Integer>> ans= new ArrayList<>();
         List<Integer> list= new ArrayList<>();
        // boolean[] flag= new boolean[nums.length+1];
         combination(nums , 0 ,0 ,target , list, ans);// fahhhhhhhhhhhhhhh
         return ans;
    }
    void combination(int[] nums , int idx , int sum,int target , List<Integer> list , List<List<Integer>> ans  ){

        //Base conditions
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(idx>=nums.length || sum> target){
            return;
        }
        // pick the index
    
        list.add(nums[idx]);
        sum+=nums[idx];
       
        combination(nums , idx+1 , sum , target, list, ans);
        list.remove(list.size()-1);
        sum-=nums[idx];
    
    while(idx<nums.length-1 && nums[idx]==nums[idx+1]) idx++;
// what this line does is since array is sorted now .. so when two duplicates are detected it automatically do i++ till duplicates are found.

// lets submit our code..
        // dont pick
        combination(nums , idx+1 , sum , target, list, ans);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna