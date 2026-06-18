class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
         sum(candidates, ans , list ,0 , target );
         return ans;
    }
void sum(int[] arr , List<List<Integer>> ans , List<Integer> list ,int idx , int target){
        
         if(target==0){
            ans.add( new ArrayList<>(list));
            return;
        }
        if(idx==arr.length || target<0){
            return ;
        }
       
        list.add(arr[idx]);
        sum(arr , ans ,list , idx ,target-arr[idx]);
        list.remove(list.size()-1);

        sum(arr , ans ,  list ,idx+1 ,target);

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna