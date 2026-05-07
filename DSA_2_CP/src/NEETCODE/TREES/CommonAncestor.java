package NEETCODE.TREES;

public class CommonAncestor {
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
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;    
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null){
            return right;   
        }
        else if(right == null){
            return left;
        }
        else{
            return root;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);  

        // Constructing tree
        root.left = n2; // Node(2)
        root.right = n3; // Node(3)

        // Second level
        n2.left = n4; // Node(4)
        n2.right = n5; // Node(5)

        System.out.println(lowestCommonAncestor(root, n4, n5).val);
    }
}
