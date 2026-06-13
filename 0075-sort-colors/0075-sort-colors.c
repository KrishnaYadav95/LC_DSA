void sortColors(int* nums, int numsSize) {
  int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<numsSize;i++){
            if(nums[i]==0) count0++;
            else if(nums[i]==1)  count1++;
            else count2++;
        }
        int idx=0;
        while(count0--!=0){
            nums[idx++]=0;
        }
        while(count1--!=0){
            nums[idx++]=1;
        }
        while(count2--!=0){
            nums[idx++]=2;
        }
       
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna