package NEETCODE.TREES;

public class Basics {
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
        // // Creating nodes
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(6);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(8);
        TreeNode n8 = new TreeNode(10);

        root.left = n1;
        root.right = n2;
        // Second level
        n1.left = n3; // Node(4)
        n1.right = n4; // Node(5)

        n2.left = n5; // Node(6)
        n2.right = n6; // Node(7)

        // Third level
        n3.left = n7; // Node(8)
        n3.right = n8; // Node(10)
        // This creates the root and both children instantly
        // TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        System.out.println("Root value: " + root.val);
        System.out.println("Left child: " + root.left.val);
        System.out.println("Size: " + size(root));
        System.out.println("Product: " + product(root));
        System.out.println("Is Balanced: ");
        System.out.println("Max: " + max(root));
        System.out.println("Min: " + min(root));

        // Constructing tree
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

        // System.out.println("Degrees of nodes:");
        // printDegrees(root, null);
    }

    public static int size(TreeNode root) {
        return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
    }

    public static int product(TreeNode root) {
        if (root == null)
            return 1;
        return root.val * product(root.left) * product(root.right);
    }

    public static int max(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int min(TreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

}
