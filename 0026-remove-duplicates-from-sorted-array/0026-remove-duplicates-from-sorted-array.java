class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return nums[0];
        int i=0;
        int j=1;
        ArrayList<Integer> list= new ArrayList<>();
        list.add(nums[0]);
        while(j<nums.length){
            if(nums[j]==nums[i]){
                j++;
            }else{
                list.add(nums[j]);
                i=j;
                j++;
            }
        }
        Arrays.fill(nums , -1);
        for(int k=0;k<list.size();k++){
            nums[k]=list.get(k);
        }// we also have to update the nums so i using this loop
        return list.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna