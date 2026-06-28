class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> list = new ArrayList<>();
        operation(num, 0, list, "", target, 0, 0);
        return list;
    }

    void operation(String num, int idx, List<String> list, String curr,
                   int target, long prev, long res) {
        if (idx == num.length()) {
            if (res == target) {
                list.add(curr);
            }
            return;
        }

        String st = "";
        long curres = 0;
        for (int i = idx; i < num.length(); i++) {
            if (i > idx && num.charAt(idx) == '0') break; // avoid leading zeros
            st += num.charAt(i);
            curres = curres * 10 + (num.charAt(i) - '0');

            if (idx == 0) {
                operation(num, i + 1, list, st, target, curres, curres);
            } else {
                operation(num, i + 1, list, curr + "+" + st, target, curres, res + curres);
                operation(num, i + 1, list, curr + "-" + st, target, -curres, res - curres);
                operation(num, i + 1, list, curr + "*" + st, target, prev * curres, res - prev + prev * curres);
            }
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna