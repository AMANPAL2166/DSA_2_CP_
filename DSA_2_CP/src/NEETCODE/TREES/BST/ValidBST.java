package NEETCODE.TREES.BST;

public class ValidBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
   }
   public static  class Twin{
        long max;
        long min;
        Twin(int max, int min){
            this.max = max;
            this.min = min;
        }
   }
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
    private boolean validate(TreeNode node, Integer low, Integer high){
        if(node == null) return true;
        //Current node must within (low, high) bounds
        if((low != null && node.val <= low) || (high != null && node.val >= high)){
            return false;
        }
        //Left child must be < node.val | Right child must be > node.val
        return validate(node.left, low, node.val) && validate(node.right, node.val, high);
    }
    boolean flag ;
    public boolean isValidBST_2(TreeNode root) {
        flag = true;
//        maxMin(root);
        return flag;
    }

//    private Twin maxMin(TreeNode root ){
//        if (root == null) {
//            // Using Long boundaries to safely handle Integer.MIN_VALUE / MAX_VALUE cases
//            return new Twin(Long.MIN_VALUE, Long.MAX_VALUE);
//        }
//
//        Twin left = maxMin(root.left);
//        Twin right = maxMin(root.right);
//
//        // Find the maximum and minimum values in the current subtree
//        long max = Math.max((long) root.val, Math.max(left.max, right.max));
//        long min = Math.min((long) root.val, Math.min(left.min, right.min));
//
//        // BST Validation Rules:
//        // 1. Current node must be greater than the maximum of the left subtree
//        // 2. Current node must be smaller than the minimum of the right subtree
//        if (root.val <= left.max) flag = false;
//        if (root.val >= right.min) flag = false;
//
//        return new Twin(max, min);
//    }

}
