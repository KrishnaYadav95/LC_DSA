class Solution {
    public String reverseWords(String s) {
        // step1-> reverse the full string
        // eulb si yks eht
        // step2-> reverse each word again
        // blue is sky the
        
        
        s=s.trim();
        ArrayList<String> list= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        int i=0;
        int j=0;
        while(j<sb.length()){
            if(sb.charAt(j)==' '){
                if(i!=j){
               list.add(reverse(sb , i ,j));
               list.add(" ");
                }
                i=j+1;
            }
            j++;
        }
       if(i!=j) list.add(reverse(sb , i, j)) ;// to add the last word
        StringBuilder ans= new StringBuilder();
        for(int l=0;l<list.size();l++){
            ans.append(list.get(l));
        }
        return ans.toString();
    }
String reverse(StringBuilder sb , int i , int j){
    StringBuilder str= new StringBuilder();
    for(int k=j-1 ; k>=i ; k--){
        str.append(sb.charAt(k));
    }
   
    return str.toString();
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna