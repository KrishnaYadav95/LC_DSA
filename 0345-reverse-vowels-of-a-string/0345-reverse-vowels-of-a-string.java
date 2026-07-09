class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            char ch1 = arr[i];
            char ch2 = arr[j];

            if (isVowel(ch1) && isVowel(ch2)) {
                swap(arr, i, j);
                i++;
                j--;
            } else if (isVowel(ch1) && !isVowel(ch2)) {
                j--;
            } else {
                i++;
            }
        }

        return new String(arr);
    }

    void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna