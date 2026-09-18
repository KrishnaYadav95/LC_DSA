class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length + 1];
        for (int[] i : dp) Arrays.fill(i, -1);

        return f(0, -1, nums, nums.length, dp);
    }

    int f(int idx, int prev_idx, int[] arr, int n, int[][] dp) {
        if (idx == n) return 0;

        if (dp[idx][prev_idx + 1] != -1)
            return dp[idx][prev_idx + 1];

        int len = 0 + f(idx + 1, prev_idx, arr, n, dp);

        if (prev_idx == -1 || arr[idx] > arr[prev_idx]) {
            len = Math.max(len, 1 + f(idx + 1, idx, arr, n, dp));
        }

        return dp[idx][prev_idx + 1] = len;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna