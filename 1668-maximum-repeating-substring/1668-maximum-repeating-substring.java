class Solution {
    public int maxRepeating(String sequence, String word) {
        String newword=word;
       int count=0;
        while(sequence.contains(newword)){
            count++;
            newword= newword+word;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna