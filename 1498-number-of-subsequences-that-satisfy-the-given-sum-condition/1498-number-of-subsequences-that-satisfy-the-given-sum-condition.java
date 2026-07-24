class Solution {
    public int numSubseq(int[] nums, int target) {
        // step1-. sort
        Arrays.sort(nums);
        // step2-. precompute power 
        int[] pow= new int[nums.length+1];
        int mod=1000000007;
        pow[0]=1;
        for(int k=1;k<nums.length;k++){
            pow[k]= (pow[k-1]*2) % mod;
        }
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<=j){
            if(nums[i]+nums[j]<=target){
                count= (count+ pow[j-i])%mod;
                i++;
            }else j--;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna