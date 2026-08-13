class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] result = new int[n];
        Arrays.fill(result , -1);
        int i=0;
        int j=0;
        long sum=0;
        int windowsize= 2*k+1;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1==windowsize){
                result[i+k]= (int)(sum/windowsize);
            }
            if(j-i+1>windowsize){
                sum-=nums[i];
                i++;
                result[i+k]=(int)(sum/windowsize);
            }
            j++;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna