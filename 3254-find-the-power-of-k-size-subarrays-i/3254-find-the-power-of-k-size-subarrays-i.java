class Solution {
    public int[] resultsArray(int[] nums, int k) {
        List<Integer> list= new ArrayList<>();
        int i=0;
        int j=0;
        while(j<nums.length){
            if(j-i+1>k){
                i++;
            }
            if(j-i+1==k){
                if(isSorted(nums, i, j)){
                    list.add(nums[j]);
                }else{
                    list.add(-1);
                }
            }
            j++;
        }
        int[] arr= new int[list.size()];
        for(int x=0;x<list.size();x++){
            arr[x]=list.get(x);
        }
        return arr;
    }
    boolean isSorted(int[] nums, int i, int j){
        for(int x=i+1;x<=j;x++){
            if(nums[x]-nums[x-1]!=1) return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna