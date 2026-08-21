class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n= colors.length;
        int[] nums= new int[n+ k-1];
        int idx=0;
        for(int i=0;i<colors.length;i++){
            nums[idx++]=colors[i];
        }
        for(int i=0;i<k-1;i++){
            nums[idx++]=colors[i];
        }
        // 0 1 0 1 0 0 1
        int i=0;
        int j=0;
        int count=0;
        while(j<nums.length){
            if(j>0 && nums[j]==nums[j-1]){
                i=j;
            }
            if(j-i+1>=k){
                i=j-k+1;
                count++;
            }
            j++;
        }
        return count;
    }
   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna