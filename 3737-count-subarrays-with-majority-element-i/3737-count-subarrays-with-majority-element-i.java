class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int[] pref= new int[nums.length+1];
        int n=nums.length;
        for(int i=0; i<n;i++){
            pref[i+1]= pref[i]+ (nums[i]==target ? 1 :-1);
        }
        int ans=0;
        for(int l=0;l<n;l++){
            for(int r=l;r<n;r++){
                if(pref[r+1]-pref[l]>0) ans++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna