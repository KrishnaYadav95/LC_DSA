class Solution {
    public int longestBalanced(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
             HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                 map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                if (checkCount(map)) max = Math.max(max, j - i+1);
            }
        }
        return max;
    }

    boolean checkCount(HashMap<Character , Integer> map) {
       int count=-1;
     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        int val= entry.getValue();
        if(count==-1) count=val;
        if(count!=val) return false;
       }
       return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna