package NEETCODE.TREES.BST;

public class InsertInBST {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            right = left = null;
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(val < root.val){
            root.left = insertIntoBST(root.left, val);
        }
        else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;

    }
}
