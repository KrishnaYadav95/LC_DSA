class Solution {
    public int numberOfSubstrings(String s, int k) {
        int left=0;
        int right=0;
        int count=0;
        while(right<s.length()){
            if(contain(s, left, right, k)){
                count+=s.length()-right;
                left++;
            }else{
                right++;
            }
        }
        return count;
    }
    boolean contain(String s , int left, int right  ,int k){
       HashMap<Character,Integer> map = new HashMap<>();
       for(int i=left;i<=right; i++){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
       }
       for(Map.Entry<Character, Integer> entry: map.entrySet()){
        int val = entry.getValue();
        if(val>=k) return true;
       }
       return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna