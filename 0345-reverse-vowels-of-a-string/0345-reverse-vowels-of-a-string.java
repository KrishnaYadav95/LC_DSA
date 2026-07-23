class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char [] arr= s.toCharArray();
        while(i<=j){
            char ch1= s.charAt(i);
            char ch2= s.charAt(j);
            if(isVowel(ch1)&& isVowel(ch2)) {
                char temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!isVowel(ch1)) i++;
            else j--;
        }
        return new String(arr);
    }
    boolean isVowel(char ch){
        if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
        return true;

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna