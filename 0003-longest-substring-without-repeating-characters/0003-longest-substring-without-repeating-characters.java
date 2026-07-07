class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int i=0;
        int maxlength=0;
        for(int j=0; j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                 i++;  
            }
                 set.add(s.charAt(j));
                  maxlength= Math.max(maxlength , j-i+1);
            
        }
        return maxlength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna