package NEETCODE.TREES;

import java.util.Stack;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
    TreeNode(int val ){this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.right = right;
        this.left = left;

    }
}
public class KthSmallestElement {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // 1. Push all left children of the current node to the stack
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // 2. Pop the top element from the stack (smallest available value)
            current = stack.pop();
            k--; // Decrement the counter as we processed one node

            // 3. If k becomes 0, this is the k-th smallest element
            if (k == 0) {
                return current.val;
            }

            // 4. Move to the right subtree of the popped node
            current = current.right;
        }

        return -1;


    }

}
