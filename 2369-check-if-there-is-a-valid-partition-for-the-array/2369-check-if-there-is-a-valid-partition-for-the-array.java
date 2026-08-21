class Solution {
    public boolean validPartition(int[] nums) {
        Boolean[] memo = new Boolean[nums.length + 1];
        return solve(nums, 0, memo);
    }

    boolean solve(int[] nums, int i, Boolean[] memo) {
        if (i == nums.length) return true;
        if (memo[i] != null) return memo[i];
        boolean flag1 = twice(nums, i) && solve(nums, i + 2, memo);
        boolean flag2 = thrice(nums, i) && solve(nums, i + 3, memo);
        boolean flag3 = consecutive(nums, i) && solve(nums, i + 3, memo);
        return memo[i] = (flag1 || flag2 || flag3);
    }

    boolean twice(int[] nums, int i){
        return i+1 < nums.length && nums[i] == nums[i+1];
    }
    boolean thrice(int[] nums, int i){
        return i+2 < nums.length && nums[i]==nums[i+1] && nums[i+1]==nums[i+2];
    }
    boolean consecutive(int[] nums, int i){
        return i+2 < nums.length && nums[i+1]-nums[i]==1 && nums[i+2]-nums[i+1]==1;
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna