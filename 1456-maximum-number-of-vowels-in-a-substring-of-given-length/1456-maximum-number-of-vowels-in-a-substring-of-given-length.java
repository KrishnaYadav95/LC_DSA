class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int countVowel=0;
        int max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
             if(j-i+1>k){
                if(isVowel(s.charAt(i))) countVowel--;
                i++;
            }
            if(isVowel(ch)) countVowel++;
            if(j-i+1==k){
                max=Math.max(max , countVowel);
            }
           
            j++;
        }
        return max;
    }
    boolean isVowel(char ch){
        if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') return true;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna