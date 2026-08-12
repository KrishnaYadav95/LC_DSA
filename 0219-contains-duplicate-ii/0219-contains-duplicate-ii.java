class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (set.contains(nums[j])) {
                return true;
            }

            set.add(nums[j]);

            if (j - i >= k) {
                set.remove(nums[i]);
                i++;
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna