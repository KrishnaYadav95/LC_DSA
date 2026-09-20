class Solution {
    public int reverseDegree(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int idx=26;
        for(char ch='a'; ch<='z';ch++){
            map.put(ch , idx--);
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
           sum+= (i+1)*map.get(s.charAt(i));
        }
        return sum;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna