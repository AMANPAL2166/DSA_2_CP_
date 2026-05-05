package NEETCODE.TREES;
import java.util.ArrayList;
import java.util.List;

public class RightSideView {
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        // System.out.println(rightSideView(root));
    }

    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        solve(root, result, 0);
        return result;
    }

    private static void solve(TreeNode root, List<Integer> result, int level) {
       // Base case: agar node null hai toh wapas mud jao
       if(root == null) return;
        
        // Agar ye is level ka pehla node hai jo hum dekh rahe hain,
        // toh ise result mein add kar do.
        if (level == result.size()) {
            result.add(root.val);
        }
        
        // Sabse important step: Pehle RIGHT child visit karo, phir LEFT.
        // Isse har level ka right-most node pehle milega.
        solve(root.right, result, level + 1 );
        solve(root.left , result,  level + 1 );
    }



}
