class Solution {
    public int numberOfSubstrings(String s, int k) {
        char [] freq= new char[26];
        int i=0;
        int ans=0;
        for(int j=0; j<s.length(); j++){
            freq[s.charAt(j)-'a']++;
       
        while(freq[s.charAt(j)-'a']>=k){
            ans+=s.length()-j;
            freq[s.charAt(i)-'a']--;
            i++;
        }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna