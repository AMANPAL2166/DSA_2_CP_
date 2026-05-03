package NEETCODE.TREES;
import java.util.ArrayList; 

public class PreOrderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private static ArrayList<Integer> ans;
    public static ArrayList<Integer> preOrder(TreeNode root, ArrayList<Integer> ans) {
        ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
    public  static void dfs(TreeNode root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);
        dfs(root.left, ans);
        dfs(root.right, ans);
         
    }
    
}
