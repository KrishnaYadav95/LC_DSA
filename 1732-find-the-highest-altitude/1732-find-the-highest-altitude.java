class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(0 , 0);
        list.add(1, gain[0]);
        int sum=gain[0];
        for(int i=1;i<gain.length;i++){
            sum+=gain[i];
            list.add(sum);
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna