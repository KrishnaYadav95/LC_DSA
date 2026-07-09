class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int a=0;
        int b=0;
        int c=0;
        int count=0;
        for(int j=0;j<s.length();j++){
           if(s.charAt(j)=='a') a++;
           else if(s.charAt(j)=='b') b++;
           else c++;

           while(a>0 && b>0 && c>0){
            count+= s.length()-j;
           
           if(s.charAt(i)=='a') a--;
           else if(s.charAt(i)=='b') b--;
           else c--;
           i++;
        }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna