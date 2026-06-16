class Solution {
    public String processStr(String s) {
        String newString="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
              newString=  duplicate(newString);
            }
           else if(s.charAt(i)=='*'){
              newString=  remove(newString);
            }
           else if(s.charAt(i)=='%'){
               newString= reverse(newString);
            }
            else{
                newString+=s.charAt(i);
            }
        }
        return newString;
    }
    String duplicate(String s){
        s=s+s;
        return s;
    }
    String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
   String remove(String s){
    if (s == null || s.isEmpty()) {
    return s; // or return "" 
}
       return  s.substring(0, s.length()-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna