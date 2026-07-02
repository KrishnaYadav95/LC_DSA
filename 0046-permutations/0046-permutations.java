class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        perm(nums, 0, list, ans ,flag);
        return ans;
    }

    void perm(int[] nums, int idx, List<Integer> list, List<List<Integer>> ans , boolean[] flag) {

        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (idx >= nums.length) {
            return;
        }

        //pick
        for (int i = 0; i < nums.length; i++) {
            if (!flag[i]) {
                 flag[i] = true;
                list.add(nums[i]);
                perm(nums, idx+1  ,list, ans , flag);
                list.remove(list.size() - 1);
                flag[i] = false;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna