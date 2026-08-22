class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // 1 3 1 2 2 
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        // 1 3 2
        int k= set.size();
        int i=0;
        int j=0;
        int count=0;
        int n= nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j<nums.length){
           map.put(nums[j], map.getOrDefault(nums[j],0)+1);
           while(map.size()==k){
            count+=(n-j);
             map.put(nums[i], map.getOrDefault(nums[i],0)-1);
             if(map.get(nums[i])==0){
                map.remove(nums[i]);
             }
             i++;
           }
           j++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna