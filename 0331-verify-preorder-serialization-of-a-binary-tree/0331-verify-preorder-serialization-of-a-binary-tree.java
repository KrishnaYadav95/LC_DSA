class Solution {
    public boolean isValidSerialization(String preorder) {
        if(preorder== null) return false;
        Stack<String> st= new Stack();
        String[] arr= preorder.split(",");
        for(int i=0;i<arr.length;i++){
            while(arr[i].equals("#") && !st.isEmpty() && st.peek().equals("#")){
                st.pop();
                if(st.isEmpty()) return false;
                st.pop();
            }
            st.push(arr[i]);
        }
        return st.size()==1 && st.peek().equals("#");
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna