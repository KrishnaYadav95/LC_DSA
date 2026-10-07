class Solution {
    public int beautySum(String s) {
       
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
             HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                     int maxFreq = 0;
                     int minFreq = Integer.MAX_VALUE;
                if (map.size() > 1) {
                    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                       
                        int key = entry.getValue();
                        if (key > maxFreq) {
                            maxFreq = key;
                        }
                        if (key < minFreq) {
                            minFreq = key;
                        }
                    }
                    count+=(maxFreq-minFreq);
                }
                
            }

        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna