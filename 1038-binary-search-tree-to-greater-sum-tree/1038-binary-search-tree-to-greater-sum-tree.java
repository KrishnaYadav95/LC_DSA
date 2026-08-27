class Solution {
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        inorder(root , list);
       // 0 1 2 3 4 5 6 7 8 
       return travel(root, list);
    }
    TreeNode travel(TreeNode root , List<Integer> list ){
        if(root==null) return null ;
        travel(root.right , list );
        sum += root.val;
       root.val = sum;
      
        travel(root.left , list);

        return root;
    }
    void inorder(TreeNode root , List<Integer> list){
        if(root==null){
            return ;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna