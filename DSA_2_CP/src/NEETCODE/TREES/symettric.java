package NEETCODE.TREES;

public class symettric {
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
    
    public boolean isSymmetric(TreeNode root){
        if(root == null)return true;
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null ) return false;
        //value should be same and arguments should be mirrors of each other
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        symettric s = new symettric();
        System.out.println(s.isSymmetric(root));
    }
}
