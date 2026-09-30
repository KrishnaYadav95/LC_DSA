class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        int count1=0;
        int count2=0;
        int i=0;
       for(int j=0;j<s.length();j++){
        char ch= s.charAt(j);
        if(ch=='(') count1++;
        if(ch==')') count2++;
        if(count1==count2){
             sb.append(s.substring(i+1, j));
            i=j+1;
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