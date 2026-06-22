class Solution {
    public int rearrangeCharacters(String s, String target) {
         Map<Character, Integer> map = new HashMap<>();
        for (char ch : target.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
         Map<Character, Integer> inArray = new HashMap<>();
        for (char ch : s.toCharArray()) {
            inArray.put(ch, inArray.getOrDefault(ch, 0) + 1);
        }
                int result = Integer.MAX_VALUE;
        for(Map.Entry<Character , Integer> entry: map.entrySet()){
            char ch= entry.getKey();
            int required= entry.getValue();
            int available= inArray.getOrDefault(ch , 0);
            result= Math.min(result , available/required);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna