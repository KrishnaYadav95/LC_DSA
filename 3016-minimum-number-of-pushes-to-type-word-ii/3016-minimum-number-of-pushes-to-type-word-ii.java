class Solution {
    public int minimumPushes(String word) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<word.length();i++){
            if (!sb.toString().contains(String.valueOf(word.charAt(i)))) {
                sb.append(word.charAt(i));
            }
        }
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i) , map.getOrDefault(word.charAt(i) , 0)+1);
        }
        Character[] arr= new Character[sb.length()];
        for(int i=0;i<sb.length();i++){
            arr[i]=sb.charAt(i);
        }
        Arrays.sort(arr , (a, b)-> map.get(b)- map.get(a));

        sb.setLength(0);
        for (char ch : arr) {
            sb.append(ch);
        }

        int sum=0;
        for(int i=0;i<sb.length();i++){
            int count= countPushes(sb, 0 , sb.charAt(i));
            int val = map.get(sb.charAt(i));
            sum+= count*val;
        }
        return sum;
    }
    // we will provide word string without duplicates
    int countPushes(StringBuilder word , int count , char ch){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch)
            count+= (i/8)+1;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna