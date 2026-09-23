class Solution {

    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][n + 1];
        int[][] cnt = new int[n + 1][n + 1];
        for(int[] i : dp) Arrays.fill(i, -1);
        for(int[] i : cnt) Arrays.fill(i, -1);
        fis(nums, 0, -1, dp, cnt);
        return cnt[0][0];
    }

    int fis(int[] nums, int idx, int prev, int[][] dp, int[][] cnt) {
        if(idx >= nums.length) return 0;
        if(dp[idx][prev + 1] != -1) return dp[idx][prev + 1];

        int skip = fis(nums, idx + 1, prev, dp, cnt);
        int skipCnt = Math.max(cnt[idx + 1][prev + 1], 0);

        int take = 0, takeCnt = 0;
        if(prev == -1 || nums[idx] > nums[prev]) {
            take = 1 + fis(nums, idx + 1, idx, dp, cnt);
            takeCnt = Math.max(cnt[idx + 1][idx + 1], 1);
        }

        cnt[idx][prev + 1] = take > skip ? takeCnt : skip > take ? skipCnt : takeCnt + skipCnt;
        return dp[idx][prev + 1] = Math.max(take, skip);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna