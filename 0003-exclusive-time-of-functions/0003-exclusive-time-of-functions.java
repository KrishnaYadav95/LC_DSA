class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        int prevTime = 0;

        for (String log : logs) {
            String[] parts = log.split(":");

            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (type.equals("start")) {

                if (!st.isEmpty()) {
                    ans[st.peek()] += time - prevTime;
                }

                st.push(id);
                prevTime = time;

            } else {

                ans[st.peek()] += time - prevTime + 1;
                st.pop();

                prevTime = time + 1;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna