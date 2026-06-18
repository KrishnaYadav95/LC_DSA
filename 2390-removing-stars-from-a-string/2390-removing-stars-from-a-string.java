class Solution {
    public String removeStars(String s) {
        Stack<Character> st= new Stack();
        for(int i=0;i<s.length(); i++){
            char ch= s.charAt(i);
             st.push(ch);
            if(ch=='*'){
                st.pop();
                st.pop();
            }
           
        }
        String str="";
        while(!st.isEmpty()){
            str+=st.pop();
        }
        String rev="";
        for(int i=str.length()-1 ; i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna