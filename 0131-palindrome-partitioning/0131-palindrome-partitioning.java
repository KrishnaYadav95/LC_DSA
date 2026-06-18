class Solution {
    public List<List<String>> partition(String s) {
        List<String> list= new ArrayList<>();
        List<List<String>> ans= new ArrayList<>();
        parti(s, 0 , list, ans);
        return ans;
    }
    void parti(String s , int idx , List<String> list , List<List<String>> ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=idx ;i<s.length();i++){
            if(isPallindrome(s, idx , i)){
                list.add(s.substring(idx ,i+1));
                parti(s, i+1 , list , ans);
                list.remove(list.size()-1);
            }
        }
    }
    boolean isPallindrome(String s ,int start , int end){
        while(start<end) {
            if(s.charAt(start++)!=s.charAt(end--))
           return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna