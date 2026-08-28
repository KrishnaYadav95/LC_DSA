class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        List<Character> list= new ArrayList<>();
        for(int i=0; i<brokenLetters.length(); i++){
            list.add(brokenLetters.charAt(i));
        }
        int i=0;
        int count=0;
        int og=0;
        for(int j=0;j<=text.length(); j++){
            if( j==text.length() || text.charAt(j)==' '){
                String str= text.substring(i , j);
                count=0;
                for(int k=0;k<str.length(); k++){
                    if(list.contains(str.charAt(k))){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    og++;
                }
                i=j+1;
            }
        }
        return og;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna