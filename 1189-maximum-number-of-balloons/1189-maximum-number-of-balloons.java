class Solution {
    public int maxNumberOfBalloons(String text) {
        String target= "balloon";
        // put the char frequency of ballon in map
        Map<Character , Integer> map1= new HashMap<>();
        for(int i=0;i<target.length();i++){
            map1.put(target.charAt(i) , map1.getOrDefault(target.charAt(i),0)+1);
        }
        Map<Character , Integer> map2= new HashMap<>();
        for(int i=0;i<text.length();i++){
            map2.put(text.charAt(i) , map2.getOrDefault(text.charAt(i),0)+1);
        }
        int result=Integer.MAX_VALUE;
        for(Map.Entry<Character , Integer> entry: map1.entrySet()){
            char ch= entry.getKey();
            int required= entry.getValue();
            int available= map2.getOrDefault(ch ,0);
            result=Math.min(result , available/required);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna