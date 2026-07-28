class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1) return s;

        char[] arr = s.toCharArray();
        int n = arr.length;

        List<Character> list = reverse(arr, 0, n / 2);
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        // First half
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        // Middle character
        if (n % 2 != 0) {
            sb.append(arr[n / 2]);
        }

        // Second half
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }

        return sb.toString();
    }

    List<Character> reverse(char[] arr, int i, int j) {
        List<Character> list = new ArrayList<>();

        for (int k = i; k < j; k++) {
            list.add(arr[k]);
        }

        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna