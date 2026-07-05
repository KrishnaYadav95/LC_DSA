class Solution {
    public ArrayList<String> powerSet(String s) {
        // code here
        StringBuilder sb= new StringBuilder();
        ArrayList<String> ans= new ArrayList<>();
        set(s, 0 , sb , ans);
        return ans;
        
    }
    void set(String s , int idx , StringBuilder sb , ArrayList<String> ans){
        
        if(idx==s.length()){
            ans.add(sb.toString());
            return ;
        }
        if(idx>=s.length()){
            return ;
        }
        
        // pick the element 
        sb.append(s.charAt(idx));
        set(s, idx+1 , sb , ans);
        sb.deleteCharAt(sb.length()-1);
        
        //dont pick 
        set(s, idx+1 , sb , ans);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna