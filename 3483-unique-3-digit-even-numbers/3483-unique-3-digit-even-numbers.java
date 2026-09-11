class Solution {
    int count = 0;

    public int totalNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        boolean[] flag = new boolean[digits.length];

        perm(digits, 0, list, flag);

        return count;
    }

    void perm(int[] digits, int idx, List<Integer> list, boolean[] flag) {

        if (list.size() == 3) {
            if (list.get(list.size() - 1) % 2 == 0)
                count++;

            return;
        }

         boolean[] used = new boolean[10];

        for (int i = 0; i < digits.length; i++) {

            if (!flag[i]) {

                if (used[digits[i]])
                    continue;

                // First digit cannot be 0
                if (list.size() == 0 && digits[i] == 0)
                    continue;
                    used[digits[i]] = true; 
                flag[i] = true;
                list.add(digits[i]);

                perm(digits, i + 1, list, flag);

                list.remove(list.size() - 1);
                flag[i] = false;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna