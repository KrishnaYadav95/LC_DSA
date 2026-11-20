class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i:nums){
            if(i%2==0) list1.add(i);
            else list2.add(i);
        }
        int i=0;
        int j=0;
        int[] ans= new int[nums.length];
        int idx=0;
        while(i<list1.size() && j<list2.size()){
            ans[idx++]=list1.get(i++);
            ans[idx++]=list2.get(j++);
        }
        while(i<list1.size()){
            ans[idx++]=list1.get(i++);
        }
        while(j<list2.size()){
            ans[idx++]=list2.get(j++);
        }
        for(int x=0;x<nums.length;x++){
            nums[x]=ans[x];
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna