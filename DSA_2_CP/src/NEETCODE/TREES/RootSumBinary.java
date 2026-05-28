package NEETCODE.TREES;

import java.util.ArrayList;
import java.util.List;

public class RootSumBinary {
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int x){
            val = x;
            left = right = null;
        }
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=  new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        printPathUtil(root, targetSum , 0, path, ans);
        return ans;

    }

    public static void printPathUtil(TreeNode curr, int sum, int currSum , List<Integer> path, List<List<Integer>> ans) {
        if(curr == null) return ;
        //Add curr node
        currSum += curr.val;
        path.add(curr.val);
        //If sum matches -> store path
        // Check if we reached a leaf node and the path sum matches targetSum
        if (curr.left == null && curr.right == null) {
            if (currSum == sum) {
                // Fix: Add a copy of the path, not a reference to the mutable list
                ans.add(new ArrayList<>(path));
            }
        } else {
            // Recur left and right only if children exist (or let the null check handle it)
            printPathUtil(curr.left, sum, currSum, path, ans);
            printPathUtil(curr.right, sum, currSum, path, ans);
        }

        // Backtrack: remove the current node from the path before going up the tree
        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(20);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(15);
        root.right.left.left = new TreeNode(6);

        int sum = 8;

        List<List<Integer>> result = pathSum(root, sum);
        for (List<Integer> path : result) {
            for (int val : path) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


    }
}
