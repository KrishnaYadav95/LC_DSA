/* Structure of Binary Tree Node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    void mirror(Node root) {
        // code here
        helper(root);
    }
    void helper(Node node){
        if(node==null) return ;
        if(node.left!=null || node.right!=null){
           
         Node   temp= node.left;
            node.left=node.right;
            node.right=temp;
        }
        helper(node.left);
        helper(node.right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna