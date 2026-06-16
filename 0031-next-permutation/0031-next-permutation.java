class Solution {
    public void nextPermutation(int[] nums) {
        int idx1=-1;// we avoid index 0 because that can be a required index in some case
        for(int i=nums.length-1;i>=0;i--){
            if(i>0 && nums[i-1]<nums[i]){
                idx1=i-1;
                break;
            }
        }
        if(idx1==-1){
            int i=0;
            int j=nums.length-1;
            while(i<=j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            return ;
        }
        int idx2=-1;
        for(int j=nums.length-1;j>=0;j--){
            if(nums[idx1]<nums[j]){
                idx2=j;
                break;
            }
        }
        // swap idx1 to idx2
        int temp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;

        // reverse from idx+1 to idx2
        int i=idx1+1;
        int j= nums.length-1;
        while(i<=j){
            int temp2= nums[i];
            nums[i]=nums[j];
            nums[j]= temp2;
            i++;
            j--;
        }
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna