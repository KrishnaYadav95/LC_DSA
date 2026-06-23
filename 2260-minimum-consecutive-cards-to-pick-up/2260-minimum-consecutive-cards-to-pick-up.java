class Solution {
    public int minimumCardPickup(int[] nums) {
        HashMap<Integer , Integer> map= new HashMap<>();
        int min= Integer.MAX_VALUE;
        for(int i=0;i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                int idx = map.get(nums[i]);
                min = Math.min(min, i-idx+1);
            }
            
            map.put(nums[i] , i);
            
        }
        return min==Integer.MAX_VALUE ? -1 : min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna