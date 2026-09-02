class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            String binary = Integer.toBinaryString(s.charAt(i));
            while(binary.length()<8) binary= "0"+binary; 
            sb.append(binary);
        }
        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna