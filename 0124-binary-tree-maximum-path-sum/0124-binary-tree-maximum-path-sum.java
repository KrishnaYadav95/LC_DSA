class Solution {
    int max= Integer.MIN_VALUE;;
    
    public int maxPathSum(TreeNode root) {
        helper(root );
        return max;
    }
    int helper(TreeNode root ){
        if(root==null) return 0;
       
      int left=Math.max(0, helper(root.left));
      int right= Math.max(0,helper(root.right));
    max=Math.max(max, left+right+root.val);
    return Math.max(left , right)+root.val;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna