package NEETCODE.TREES;

public class ValidBST_ {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            left = null;
            right = null;
        }
    }
    public static boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
    private static boolean validate(TreeNode node, Integer low, Integer high){
        if(node == null) return true;
        //Current node must within (low, high) bounds
        if((low != null && node.val <= low) || (high != null && node.val >= high)){
            return false;
        }
        //Left child must be < node.val | Right child must be > node.val
        return validate(node.left, low, node.val) && validate(node.right, node.val, high);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ValidBST_ s = new ValidBST_();
        System.out.println(s.isValidBST(root));
    }
}
