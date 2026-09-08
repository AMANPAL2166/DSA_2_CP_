package Binary_Tree;

public class ChildrenSum {
    class Node{
        int data;
        Node left, right;
        Node(int val){
            data = val;
            left = right = null;
        }
    }
    void changeTree(Node root){
        //check base case
        if(root == null) return;
        //create a sum var to add left child and right child, if  they exist.
        int sum = 0;
        if(root.left != null){
            sum += root.left.data;
        }
        if(root.right != null){
            sum+= root.right.data;
        }
        //check sum val, if sum > root.data then update root data with current sum val, else update it's children with current sum value it their children exist.
        if(sum > root.data){
            root.data = sum;
        }else {
            if(root.left != null){
                root.left.data = root.data;
            }
            if(root.right != null){
                root.right.data = root.data;
            }
        }
        /// call left and right child recursively
        changeTree(root.left);
        changeTree(root.right);
        //calculate the sum of the values of the right children,, if they exist
        int tot = 0;
        if(root.left != null){
            tot+= root.left.data;
        }
        if(root.right != null){
            tot += root.right.data;
        }
        // if either left or child exits, update the current node's value with total sum
        if(root.right != null || root.left != null){
            root.data = tot;
        }
    }
}
