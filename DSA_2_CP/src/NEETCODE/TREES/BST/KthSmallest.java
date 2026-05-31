package NEETCODE.TREES.BST;

import java.util.ArrayList;

public class KthSmallest {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            left = right = null;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        if(ans.size()<k) return -1;
        return ans.get(k-1);

    }

    private void inorder(TreeNode root, ArrayList<Integer> ans) {
        if(root == null) return ;
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }

    public static void main(String[] args) {

    }
}
