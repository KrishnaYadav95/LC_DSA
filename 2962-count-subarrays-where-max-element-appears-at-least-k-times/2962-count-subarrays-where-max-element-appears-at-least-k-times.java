class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        int i = 0;
        int j = 0;
        int count = 0;
        long ans = 0;
        while (j < nums.length) {
            if (nums[j] == max) {
                count++;
            }
            while(count >= k) {
                if (nums[i] == max)
                    count--;
                i++;
            }
            ans += i;
            j++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna