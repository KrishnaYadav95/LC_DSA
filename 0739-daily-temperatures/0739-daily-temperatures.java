class Solution {
    public int[] dailyTemperatures(int[] nums) {
     Stack<Integer> st = new Stack<>();
     int[] ans= new int[nums.length];
     for(int i=0;i<nums.length ;i++){
    while(!st.isEmpty() && nums[i]>nums[st.peek()]){
        int j= st.pop();
        ans[j]=i-j;
    }
    st.push(i);
     }   
     return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna