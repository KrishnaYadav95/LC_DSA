class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list= new ArrayList<>();
        int fact=1;
        for(int i=1;i<=n ; i++){
            list.add(i);
            fact=fact*i;
        }
        k--;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            fact=fact/(n-i);
            int index= k/fact;
            sb.append(list.get(index));
            list.remove(index);
            k=k%fact;
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna