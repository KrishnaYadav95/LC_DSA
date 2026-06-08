class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right= new ArrayList<>();
        ArrayList<Integer> middle= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot) right.add(nums[i]);
            else if(nums[i]<pivot) left.add(nums[i]);
            else middle.add(nums[i]);
        }
        int[] ans= new int[left.size() + middle.size() + right.size()];
       int x=0;
        for(int  i=x;i<left.size();i++){
            ans[x++]=left.get(i);

        }
        for(int i=0;i<middle.size();i++){
            ans[x++]=middle.get(i);
        }
        for(int i=0;i<right.size();i++){
            ans[x++]=right.get(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna