class Solution {
    int prevsum=0;
    public TreeNode bstToGst(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        inorder(root , list);
       // 0 1 2 3 4 5 6 7 8 
       int sum=0;
       for(int i=0;i<list.size();i++){
        sum+=list.get(i);
       }
       return travel(root, list,  sum);
    }
    TreeNode travel(TreeNode root , List<Integer> list , int sum){
        if(root==null) return null ;
        travel(root.right , list , sum);
       root.val += prevsum;
      prevsum = root.val;
        travel(root.left , list, sum);

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