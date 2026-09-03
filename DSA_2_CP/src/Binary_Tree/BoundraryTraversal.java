package Binary_Tree;
import java.util.ArrayList;
import java.util.List;

public class BoundraryTraversal {
     static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data ){
            this.val= data;
            this.left= null;
            this.right = null;

        }
    }
    //function to check is this leafNode?
    static boolean isLeadfNode(TreeNode root){
        return root.left == null && root.right == null;
    }
    //Function to traverse leftBoundarary
    static void leftBoundary(TreeNode root, List<Integer> ans){
        if(root == null ) return;
        TreeNode node = root.left;
        while(node != null){
            //check is this leaf node
            if(!isLeadfNode(node)){
                ans.add(node.val);
            }
            //MOve to the left child if it exits
            //otherwise move to the right child
            if(node.left != null){
                node = node.left;
            }else{
                node = node.right;
            }
        }

    }
    static void rightBoundary(TreeNode root, List<Integer> ans){
        if(root == null) return;
        //initialize a new temp array to store right traversal then reverse it
        List<Integer> temp = new ArrayList<>();
        TreeNode node = root.right;
        while(node != null){
            //check leafNode
            if(!isLeadfNode(node)){
                temp.add(node.val);
            }
            //Move to the left if it is exist
            //otherwise...
            if(node.left!= null){
                node = node.left;
            }else{
                node = node.right;
            }

        }
        for(int i = temp.size() -1;i>=0;i--){
            ans.add(temp.get(i));
        }
    }
    static void addLeaf(TreeNode root, List<Integer> ans){
        //if currentNode is leaf add to the ans
        if(isLeadfNode(root)){
            ans.add(root.val);
            return;
        }
        //Recursively add leaves of the left and right subtree
        if(root.left != null){
            addLeaf(root.left, ans);
        }
        if(root.right != null){
            addLeaf(root.right, ans);
        }
    }
    static List<Integer> printBoundrary(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        // If the root is not a leaf,
        // add its value to the result
        if (!isLeadfNode(root)) {
            res.add(root.val);
        }

        // Add the left boundary, leaves,
        // and right boundary in order
        leftBoundary(root, res);
        addLeaf(root, res);
        rightBoundary(root, res);

        return res;
    }
     static void printResult(List<Integer> ans){
        for(int i: ans){
            System.out.print(i +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Get the boundary traversal
        List<Integer> result = printBoundrary(root);

        // Print the result
        System.out.print("Boundary Traversal: ");
        printResult(result);
    }
}
