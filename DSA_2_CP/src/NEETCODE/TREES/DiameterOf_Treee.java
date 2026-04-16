package NEETCODE.TREES;
public class DiameterOf_Treee {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {

        }
        TreeNode(int val){this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;

        }
    }
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public  int  height( TreeNode nood) {
        if(nood == null) return 0;
        int left = height(nood.left);
        int right = height(nood.right);
        diameter = Math.max(left+right, diameter);
        return 1+Math.max(left, right);

    }
}
