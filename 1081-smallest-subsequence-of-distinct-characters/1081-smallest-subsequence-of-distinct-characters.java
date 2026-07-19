class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st= new  Stack();
       HashSet<Character> set = new HashSet<>();
       HashMap<Character , Integer> map = new HashMap<>();
       for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
       for(int i=0; i<s.length() ; i++){
        char ch= s.charAt(i);
        if(!set.contains(ch)){
            while(!st.isEmpty() && ch<st.peek() && i<map.get(st.peek())){
               set.remove(st.pop());
            }
            set.add(ch);
            st.add(ch);
        }
       }
       String str="";
       for(int i=0; i<st.size();i++){
        str+=st.get(i);
       }
       return str;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna