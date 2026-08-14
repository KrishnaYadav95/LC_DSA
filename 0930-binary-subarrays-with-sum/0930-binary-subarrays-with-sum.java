class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }
        int atMost(int[] nums , int goal){
         int count = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        if (goal < 0)
            return 0;
        while (j < nums.length) {
            sum += nums[j];
            while (sum > goal) {
                sum -= nums[i];
                i++;
            }
            count = count + (j - i + 1);
            j++;
        }
        return count;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna