package NEETCODE.TREES;

public class Subtree {
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }   
    public boolean isSame(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.val != subRoot.val) return false;
        return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
    }
    public static void main(String[] args) {
        // Creating nodes for the main tree
        TreeNode root = new TreeNode(3);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(2);      
        // Constructing the main tree
        root.left = n2; // Node(4)
        root.right = n3; // Node(5) 
        n2.left = n4; // Node(1)
        n2.right = n5; // Node(2)
        // Creating nodes for the subtree
        TreeNode subRoot = new TreeNode(4);
        TreeNode subN2 = new TreeNode(1);
        TreeNode subN3 = new TreeNode(2);
        // Constructing the subtree
        subRoot.left = subN2; // Node(1)
        subRoot.right = subN3; // Node(2)
        // Checking if subRoot is a subtree of root
        Subtree solution = new Subtree();
        boolean result = solution.isSubtree(root, subRoot);
        System.out.println("Is subRoot a subtree of root? " + result);  
    }        
    
}
