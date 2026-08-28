class Solution {
    public int canBeTypedWords(String text, String broken) {
        HashSet<Character> set = new HashSet<>();
        for(char c : broken.toCharArray()){
            set.add(c);
        }
        int count=0;
        String[] words= text.split(" ");
        for(int i=0;i<words.length; i++){
            for(int j=0;j<words[i].length(); j++){
                if(set.contains(words[i].charAt(j))){
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna