package Binary_Tree;

import com.sun.source.tree.Tree;

public class CountCompletetree {
    /// This method gives O(N) time and O(N) space complexity
    /// If I want to avoid single-element array, we have class level instance variable
    ///
    static int count = 0;
    public static int countNodes(TreeNode root) {
        //if tree empty return 0
        if(root == null) return 0;
        //array used to pass by reference
        //int[] array = new int[1];

        //calll inorder function count nodes
        inorderTra(root);
        return count;
    }
    static void inorderTra(TreeNode root){
        //if treee is empty return
        if(root == null ) return ;
        //coutn increment everytime when node traverse
        count++;
        //call left and right subtree
        inorderTra(root.left);
        inorderTra(root.right );
    }

    ///  This method gives O(Log(n) + Log(n)) time complexity
    //function to count nodes in complete binary tree
    public  int countNode(TreeNode root){
        //if root is empty return 0
        if(root == null) return 0;
        //get left and right height of the tree
        int leftHeight = leftHeight(root);
        int rightHeight = rightHeight(root);
        //check if height match, use perfect binary tree formula
        if(leftHeight== rightHeight){
            return (1<<leftHeight) -1;
        }
        //otherwise, recursively count left and right subtree
        return  1 + countNodes(root.left) + countNodes(root.right);
    }

    private int rightHeight(TreeNode root) {
        int height = 0;
        while (root != null){
            height++;
            rightHeight(root.right);
        }
        return height;
    }

    private int leftHeight(TreeNode root) {
        int height = 0;
        while (root != null){
            height++;
            leftHeight(root.left);
        }
        return height;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        int countNodes = countNodes(root);
        System.out.println(countNodes);
    }
}
