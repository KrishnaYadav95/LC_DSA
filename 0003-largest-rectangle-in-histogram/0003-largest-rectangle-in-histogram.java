class Solution {
    public int largestRectangleArea(int[] nums) {
        ArrayList<Integer> left = nsl(nums);
        ArrayList<Integer> right= nsr(nums);
        int[] width= new int[left.size()];
        for(int i=0;i<left.size();i++){
            width[i]=right.get(i)-left.get(i)-1;
        }
        int[] area= new int[left.size()];
        for(int i=0;i<left.size();i++){
            area[i]= width[i]*nums[i];
        }
        int max=0;
        for(int i=0; i< area.length; i++){
            if(area[i]>max) max=area[i];
        }
        return max;
    }
    ArrayList<Integer> nsl(int[] nums){
       ArrayList<Integer> list= new ArrayList<>();
       Stack<Integer> st= new Stack();
       for(int i=0;i<nums.length;i++){
        while(!st.isEmpty() && nums[st.peek()]>nums[i]){
            st.pop();
        }
        if(st.isEmpty()) list.add(-1);
        else list.add(st.peek());
        st.push(i);
       }
       return list;
    }
     ArrayList<Integer> nsr(int[] nums){
       ArrayList<Integer> list= new ArrayList<>();
       Stack<Integer> st= new Stack();
       for(int i=nums.length-1 ; i>=0;i--){
        while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
            st.pop();
        }
        if(st.isEmpty()) list.add(nums.length);
        else list.add(st.peek());
        st.push(i);
       }
       Collections.reverse(list);
       return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna