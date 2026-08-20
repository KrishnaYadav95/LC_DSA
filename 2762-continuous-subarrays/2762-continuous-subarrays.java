class Solution {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int i=0;
        int j=0;
        long count=0;
        while(j<nums.length){
            map.merge(nums[j], 1, Integer::sum);
            while(map.lastKey()-map.firstKey()>2){
                map.merge(nums[i], -1 , Integer::sum);
                if(map.get(nums[i])==0) map.remove(nums[i]);
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