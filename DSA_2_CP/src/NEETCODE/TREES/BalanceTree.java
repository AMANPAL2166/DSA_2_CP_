package NEETCODE.TREES;

public class BalanceTree {
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
    public static boolean isBalanced(TreeNode root) {
        return check(root) != -1;

    }

    private static int check(TreeNode node) {
        if(node ==null) return 0;
        int left = check(node.left);
        if(left == -1) return -1;

        int right = check(node.right);
        if(right == -1) return -1;

        if(Math.abs(left-right)>1){
            return -1;
        }
        return 1+Math.max(left, right);

    }

    public static int size(TreeNode root) {
        return (root == null)? 0: 1+ size(root.left) + size(root.right);
    }
    public static void main(String[] args) {
        // Creating nodes
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);  

        // // Constructing tree
        // addChild(root, n2);
        // addChild(root, n3);
        // addChild(n2, n4);
        // addChild(n2, n5);

        // System.out.println("Parents of each node:");
        // printParents(root, null);

        // System.out.println("Children of each node:");
        // printChildren(root);

        // System.out.print("Leaf nodes: ");
        // printLeafNodes(root);
        // System.out.println();

        // // System.out.println("Degrees of nodes:");
        // printDegrees(root, null);
        System.out.println(isBalanced(root) ? "Balanced" : "Not Balanced");

    }

}