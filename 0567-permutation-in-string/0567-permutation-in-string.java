class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char [] c1= s1.toCharArray();
        char [] c2= s2.toCharArray();
        int idx=0;// to fill element in nums
        Arrays.sort(c1);
        int windowsize= s1.length();
        int i=0;
        int j=0;
        while(j<c2.length){
            if(j-i+1>windowsize){
                i++;
            }
            if(j-i+1==windowsize){
               char[] nums=  s2.substring(i, j + 1).toCharArray();
               Arrays.sort(nums);
            if(Arrays.equals(c1, nums)) return true;
            }
            j++;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna