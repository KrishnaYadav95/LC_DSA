class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> list = new ArrayList<>();
        part(s, 0 , list, ans);
        return ans;
    }
    void part(String s , int idx , List<String> list , List<List<String>> ans){


        if(idx==s.length()){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(idx>=s.length()){
            return ;
        }

        for(int i=idx; i<s.length();i++){
            if(isPallindrome(s, idx , i)){
            list.add(s.substring(idx , i+1));
            part(s, i+1 , list, ans);
            list.remove(list.size()-1);
            }
        }
    }boolean isPallindrome(String s , int i , int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna