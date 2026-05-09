package NEETCODE.TREES;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class LargestInRow {
    public static class TreeNode {
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
    public List<Integer> largestValues(TreeNode root) {
        //base case
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i<size; i++){
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            ans.add(max);
        }
        return ans;

    }
    public static void main(String[] args) {
        // Creating nodes
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(3);  
        TreeNode n6 = new TreeNode(9);

        // Constructing tree
        root.left = n2; // Node(3)
        root.right = n3; // Node(2)

        // Second level
        n2.left = n4; // Node(5)
        n2.right = n5; // Node(3)
        n3.right = n6; // Node(9)
    }
}
