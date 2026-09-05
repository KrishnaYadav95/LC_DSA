class Solution {

    public int findTargetSumWays(int[] nums, int target) {

        int totalsum = 0;
        for(int i : nums)
            totalsum += i;

        int[][] dp = new int[nums.length][2 * totalsum + 1];

        for(int[] i : dp)
            Arrays.fill(i, -1);

        return count(nums, target, 0, 0, totalsum, dp);
    }

    int count(int[] nums, int target, int idx,
              int sum, int totalsum, int[][] dp) {

        if(idx >= nums.length) {
            if(sum == target)
                return 1;
            return 0;
        }

        if(dp[idx][sum + totalsum] != -1)
            return dp[idx][sum + totalsum];

        dp[idx][sum + totalsum] = count(nums, target, idx + 1,sum + nums[idx], totalsum, dp)
          + count(nums, target, idx + 1,sum - nums[idx], totalsum, dp);

        return dp[idx][sum + totalsum];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna