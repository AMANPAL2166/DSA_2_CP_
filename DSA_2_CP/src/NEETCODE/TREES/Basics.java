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
        TreeNode n1 = new TreeNode (2);
        TreeNode n2 = new TreeNode(9);

        root.left = n1;
        root.right = n2;    
        // This creates the root and both children instantly
        // TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
     

        System.out.println("Root value: " + root.val);
        System.out.println("Left child: " + root.left.val);
        System.out.println("Size: " + size(root));
        System.out.println("Product: " + product(root));


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
        return (root == null)? 0: 1+ size(root.left) + size(root.right);
    }
    public static int product(TreeNode root) {
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right); 
    }

}
