class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0;
        int j = 0;
        long sum = 0;
        long max = 0;
        HashSet<Integer> set = new HashSet<>();
        while (j < nums.length) {
            while (set.contains(nums[j])) {
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
               set.add(nums[j]);
            sum += nums[j];
            if (j - i + 1 > k) {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            if (j - i + 1 == k) {
                max = Math.max(max, sum);
            }
            j++;
        }
        return max;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna