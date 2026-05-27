package NEETCODE.TREES;

public class flatterTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void flatten(TreeNode root) {
        //base case
        if(root == null) return;
        TreeNode lst = root.left;
        TreeNode rst = root.right;
        root.left = null;
        flatten(lst);
        flatten(rst);
        root.right = lst;
        TreeNode last = root;//This will be last element of lst
        while(last.right != null) last = last.right;
        last.right = rst;

    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);

    }

}
