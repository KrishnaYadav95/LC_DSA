class Solution {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        int i=0;
        int j=0;
        long count=0;
        while(j<nums.length){
            freq.merge(nums[j], 1, Integer::sum);
            while(freq.lastKey()-freq.firstKey()>2){
                freq.merge(nums[i], -1, Integer::sum);
                if(freq.get(nums[i])==0) freq.remove(nums[i]);
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna