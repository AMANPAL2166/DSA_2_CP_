package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class PrintRootNode {
    static class Node{
        int data;
        Node left, right;
        Node(int val){
            this.data = val;
            left = right = null;
        }
    }
    // Function to return the final path vector
    public List<Integer> solve(Node root, int x) {
        List<Integer> ans = new ArrayList<>();
        //if tree is empty return arr
        if(root == null) return ans;
        //call get path function
        getPath(root, ans,x );
        return ans;
    }

    private boolean getPath(Node root, List<Integer> ans, int x) {
        if(root == null){
            return false;
        }
        //Add current val into arraylist
        ans.add(root.data);
        //check
        if(root.data == x){
            return true;
        }
        //run preorder traversal
        if(getPath(root.left,ans,x) || getPath(root.right,ans, x))return true;
        //if we didn't find target node then backtrack from that root node
        ans.remove(ans.size()-1);
        return false;
    }

}
    class Main {
    public static void main(String[] args) {
        // Construct the tree
        PrintRootNode.Node root = new PrintRootNode.Node(3);
        root.left = new PrintRootNode.Node(5);
        root.right = new PrintRootNode.Node(1);
        root.left.left = new PrintRootNode.Node(6);
        root.left.right = new PrintRootNode.Node(2);
        root.right.left = new PrintRootNode.Node(0);
        root.right.right = new PrintRootNode.Node(8);
        root.left.right.left = new PrintRootNode.Node(7);
        root.left.right.right = new PrintRootNode.Node(4);

        // Create solution object
        PrintRootNode sol = new PrintRootNode();

        // Target node value
        int target = 7;

        // Get path from root to target
        List<Integer> path = sol.solve(root, target);

        // Print the path
        System.out.print("Path from root to node " + target + ": ");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
            if (i < path.size() - 1)
                System.out.print(" -> ");
        }
    }
}
