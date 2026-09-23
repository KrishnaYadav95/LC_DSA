class Solution {
    public int minOperations(int[] nums, int x) {

       int total =0;
       for(int i:nums) total +=i;
       
       int target= total -x;
       // why we are finding total -x 

       // because we sre taking element from both ends , total-x gives element to keep that is middle elements .. 
       // so we will find longest length of element to keep so that minimum length is left behind
       
       if(target<0) return -1;
        int i=0;
        int j=0;
        int sum=0;
        int ans=-1;
        while(j<nums.length){
            sum+=nums[j];
            
            while(sum>target){
                sum-=nums[i];
                i++;
            }
            if(sum==target ){
                ans= Math.max(ans , j-i+1);
            }
            // we are finding maxlength of element to keep.... so it automatically gives least  element to remove .. 

            //then least element to keep will be nums.length- ans..
            j++;
        }
        return ans==-1 ? -1: nums.length- ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna