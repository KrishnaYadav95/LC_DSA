class Solution {
    public int[] dailyTemperatures(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums)
            list.add(i);
        int[] ans = new int[nums.length];
        int idx = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            while (!st.isEmpty() && list.get(i) > list.get(st.peek())) {
                int j=st.pop();
                ans[j] = i - j;
            }
            st.push(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna