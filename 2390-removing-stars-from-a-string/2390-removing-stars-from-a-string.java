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
        StringBuilder sb= new StringBuilder();
        int size=st.size();
        for(int i=0;i<size;i++){
            sb.append(st.pop());
        }
      
        return sb.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna