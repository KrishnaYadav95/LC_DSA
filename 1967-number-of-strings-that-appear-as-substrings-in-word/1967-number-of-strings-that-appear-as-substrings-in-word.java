class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0; i<patterns.length;i++){
            if(word.contains(patterns[i])) count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna