class Solution {
    public int sumCounts(List<Integer> nums) {
       
        
        int sum=0;
       for(int i=0;i<nums.size();i++){
        HashSet<Integer> set = new HashSet<>();
        for(int j=i;j<nums.size();j++){
            set.add(nums.get(j));
            sum+=set.size()*set.size();
        }
       }
       return sum;
    }
}
// 1+4+9

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna