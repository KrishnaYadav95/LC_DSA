class Solution {
    public int takeCharacters(String s, int k) {

        int a = 0, b = 0, c = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'a') a++;
            else if (ch == 'b') b++;
            else c++;
        }

        if (a < k || b < k || c < k) return -1;

        int left = 0;
        int maxWindow = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (ch == 'a') a--;
            else if (ch == 'b') b--;
            else c--;

            while (left <= right && (a < k || b < k || c < k)) {

                char cur = s.charAt(left);

                if (cur == 'a') a++;
                else if (cur == 'b') b++;
                else c++;

                left++;
            }

            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return s.length() - maxWindow;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna