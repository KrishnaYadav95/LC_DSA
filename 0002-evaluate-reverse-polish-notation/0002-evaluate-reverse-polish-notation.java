class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1) return Integer.parseInt(tokens[0]);
        Stack<Integer> st= new Stack<>();
        int x=0;
        int y=0;
        int result=0;
        for(int i=0;i<tokens.length ;i++){
            if(  tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
               
                x=st.pop();
                y=st.pop();
                
               if(tokens[i].equals("+")) result= x+y;
               if(tokens[i].equals("-")) result= y-x;
                if(tokens[i].equals("*")) result= x*y;
                if(tokens[i].equals("/")) result= y/x;
                st.push(result);
            }else{
            st.push(Integer.parseInt(tokens[i]));
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna