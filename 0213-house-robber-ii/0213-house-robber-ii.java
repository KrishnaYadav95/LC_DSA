class Solution {
    public int rob(int[] nums) {
        int[] dp1= new int[nums.length+1];
        int[] dp2= new int[nums.length+1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2 , -1);
        if(nums.length == 1) return nums[0];
        return Math.max(func1(nums, 0, nums.length-2, dp1), func2(nums, 1, nums.length-1, dp2));
    }

    int func1(int[] nums, int i, int end , int[] dp1) {
        if(i == end) return nums[i];
        if(i > end) return 0;
        if(dp1[i]!=-1) return dp1[i];
        int pick = func1(nums, i+2, end , dp1) + nums[i];
        int skip = func1(nums, i+1, end , dp1);
        dp1[i]= Math.max(pick, skip);
        return dp1[i];
    }

    int func2(int[] nums, int i, int end ,int[] dp2) {
        if(i == end) return nums[i];
        if(i > end) return 0;
          if(dp2[i]!=-1) return dp2[i];
        int pick = func2(nums, i+2, end , dp2) + nums[i];
        int skip = func2(nums, i+1, end , dp2);
        dp2[i]= Math.max(pick, skip);
        return dp2[i];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna