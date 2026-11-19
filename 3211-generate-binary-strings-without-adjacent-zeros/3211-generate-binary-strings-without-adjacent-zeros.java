class Solution {
    public List<String> validStrings(int n) {
        List<String> list= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        f(n , 0 , list , sb);
        return list;
    }
    void f(int n  , int idx , List<String> list , StringBuilder sb){
        if(idx==n){
            if(isValidString(sb.toString())){
                list.add(sb.toString());
            }
            return ;
        }
        sb.append(0);
        f(n , idx+1 , list , sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(1);
        f(n , idx+1 , list , sb);
        sb.deleteCharAt(sb.length() - 1);
    }
    boolean isValidString(String s){
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(i);
            if(j-i+1==2){
                if(!s.substring(i ,j+1).contains("1"))return false;
                i=j;
            }
            j++;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna