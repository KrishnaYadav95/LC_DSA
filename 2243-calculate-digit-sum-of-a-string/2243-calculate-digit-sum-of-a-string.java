class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
        int i=0;
        int sum=0;
        StringBuilder sb= new StringBuilder();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            sum+=ch-'0';
            if(j-i+1==k){
                sb.append(sum);
                i=j+1;
                sum=0;
            }
            if(j==s.length()-1 && i<s.length()){
                sb.append(sum);
            }
        }
        s=sb.toString();
       
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna