class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> list= new ArrayList<>();
        parti(s, 0 , list, ans);
        return ans;
    }
    boolean isPallindrome(String s  ,int i , int j){
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--))
            return false;
        }
        return true;
    }
    void parti(String s , int idx , List<String> list , List<List<String>> ans){
        // bas case
        if(idx==s.length()){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=idx;i<s.length();i++){
            if(isPallindrome(s, idx , i)){// i was checking i+1 thats out of bound 
                list.add(s.substring(idx , i+1));// i+1 is excluding string from idx to i but it is extrinsc fahh
                parti(s, i+1 , list, ans);
                list.remove(list.size()-1);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna