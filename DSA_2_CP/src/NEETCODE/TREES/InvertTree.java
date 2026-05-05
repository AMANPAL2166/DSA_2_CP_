package NEETCODE.TREES;

public class InvertTree {
    //Node structure
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x ){
            val = x;
            left = null;
            right = null;
        }
    }
    //Fuction ro return the inverted tree
    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    static void mirror(TreeNode root){
        if(root == null){
            return;
        }
        //Invert the left and right subtrees
        mirror(root.left);
        mirror(root.right);
        //Swap the left and right children of the current node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right= temp;
    }
    static int getHeight(TreeNode root, int h){
        if(root == null){
            return h-1;
        }
        
        return Math.max(getHeight(root.left, h + 1), getHeight(root.right, h + 1))  ;
    }

}
