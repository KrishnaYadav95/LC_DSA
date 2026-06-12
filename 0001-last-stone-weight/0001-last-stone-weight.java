class Solution {
    public int lastStoneWeight(int[] nums) {
        Arrays.sort(nums);
     ArrayList<Integer> list= new ArrayList<>();
     for(int i=0;i<nums.length; i++){
        list.add(nums[i]);
     }   
     while(list.size()>1){
        int x=list.get(list.size()-1);
        int y= list.get(list.size()-2);
         list.remove(list.size()-1);
            list.remove(list.size()-1);
       if(x!=y){
            list.add(Math.abs(x-y));
        }
        Collections.sort(list);
    }
 return list.size()>0 ? list.get(0): 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna