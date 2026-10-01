class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch==')'){
                if( st.isEmpty() || st.peek()!='(') return false;
                st.pop();
            }
           else if(ch=='}'){
                if( st.isEmpty() || st.peek()!='{') return false;
              st.pop();
            }
           else if(ch==']'){
                if( st.isEmpty() || st.peek()!='[') return false;
               st.pop();
            }else st.push(ch);
           
        }
        return st.size()==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna