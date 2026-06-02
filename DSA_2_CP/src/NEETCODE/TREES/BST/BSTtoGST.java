package NEETCODE.TREES.BST;

public class BSTtoGST {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            left = right = null;
        }
    }
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }
    private void traverse(TreeNode node){
        if(node == null){
            return;
        }
        //1.Visit the right subtree first
        traverse(node.right);
        //2. Process the current node
        sum += node.val;
        node.val = sum;
        //3. Process the left subTree
        traverse(node.left);

    }
}
