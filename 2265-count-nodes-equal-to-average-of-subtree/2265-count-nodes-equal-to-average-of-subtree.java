
class Solution {
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        avgSum(root );
        return ans;
    }
    int[]  avgSum(TreeNode root){
        if(root==null) return new int[] {0,0};
        int [] left= avgSum(root.left);
        int[] right= avgSum(root.right);
        int totalsum= left[0] + right[0] + root.val;
        int count= left[1] + right[1] + 1;
        int avg= totalsum/count;
        if(avg==root.val) ans++;
        return new int[] {totalsum , count};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna