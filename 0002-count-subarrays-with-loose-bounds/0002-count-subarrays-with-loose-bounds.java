class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int i = 0;
        int j = 0;
        long count = 0;
        while (j < nums.length) {
            if ( nums[j] > maxK || nums[j] < minK) {
                i = j + 1;
            }
          else  count += (j - i + 1);
            j++;

        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna