package Binary_Tree.BST;

import Binary_Tree.TreeNode;

public class InsertNode {
    public TreeNode insert(TreeNode root, int key){
        //base case because i'm going to use recursive method
        if(root == null) return new TreeNode(key);
        if(key > root.data){
            root.right = insert(root.right,key);
        }else{
            root.left = insert(root.left,key);
        }
        return root;
    }
    public  TreeNode insertIterative(TreeNode root, int key){
        if(root== null) return new TreeNode(key);
        TreeNode curr = root;
        while (true){
            if(key < curr.data){
                if(curr.left == null){
                    curr.left = new TreeNode(key);
                    break;
                }
                curr = curr.left;
            }else{
                if(curr.right == null){
                    curr.right = new TreeNode(key);
                    break;
                }
                curr = curr.right;
            }
        }
        return root;
    }
}
