class Solution {
    public int minChanges(String s) {
        int i=0;
        int j=0;
        int count1=0;
        int count0=0;
        int MainCount=0;
        while(j<s.length()){
            if(s.charAt(j)-'0'==1) count1++;
            else count0++;
            if(j-i+1==2){
                  if(count1==count0){
                    MainCount++;
                }
                           
                i=j+1;
                count1=0;
                count0=0;
            }
            j++;
        }
        return MainCount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna