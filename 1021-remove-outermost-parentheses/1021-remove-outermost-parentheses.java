class Solution {
    public String removeOuterParentheses(String s) {
        int count1=0;
        int count2=0;
        StringBuilder sb= new StringBuilder();
        int j=0;
        for                         (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='(') count1++;
            if(ch==')') count2++;
            if(count1==count2){
                sb.append(s.substring(j+1 , i));
                j=i+1;
                count1=0;
                count2=0;
            }
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna