class Solution {
    public int matchPlayersAndTrainers(int[] g, int[] s) {
         int i=0;
        int j=0;
        int count=0;
        Arrays.sort(g); // 7 8 9 10 
        Arrays.sort(s); // 5 6 7 8 
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }else if(s[j]<g[i]){
                j++;
            }else{
                i++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna