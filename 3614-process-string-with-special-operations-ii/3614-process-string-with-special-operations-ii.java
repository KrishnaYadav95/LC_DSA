class Solution {
    public char processStr(String s, long k) {
        long len=0;
        for(char ch : s.toCharArray()){
            if(ch=='*'){
                if(len>0) len--;
            }
            else if(ch=='#') len= len*2;
            else if(ch=='%')continue;
            else len++;
        }
        if(k>=len) return '.';

        for(int  i=s.length()-1 ; i>=0;i--){
            char ch= s.charAt(i);
            if(ch=='*') len++;
            
           else  if(ch=='#'){
                len=len/2;
                if(k>=len)
                k=k-len;
            }
            else if(ch=='%'){
                k= len-1-k;
            }
            else{
                 if(k==len-1) return ch;
                len--;
            }
           
        }
        return '.';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna