package NEETCODE.TREES.BST;

public class RangeSum {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            left = null;
            right = null;
        }

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val <low)return rangeSumBST(root.right, low, high);
        else if (root.val > high) {
            return rangeSumBST(root.left,low, high );
        }
        int left = rangeSumBST(root.left, low, high);
        int right = rangeSumBST(root.right, low, high);
        return left+right + root.val;

    }
}
