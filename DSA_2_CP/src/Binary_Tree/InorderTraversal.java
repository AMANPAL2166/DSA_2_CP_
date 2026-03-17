package Binary_Tree;

import java.util.ArrayList;

public class InorderTraversal {
    //NOde Structure
    static  class Node{
        int data;
        Node left;
        Node right;
        //constructor
        Node(int x){
            data = x;
            left = right=null;
        }
    }

    public static void inOrder(Node node, ArrayList<Integer> res) {
        //base case
        if(node == null){
            return;
        }
        //traverse left subreee
        inOrder(node.left, res);
        //visit the current node
        res.add(node.data);
        //traverse the rightsubTree last
        inOrder(node.right, res);

    }

    public static void main(String[] args) {
        /// Create binary tree
        //       1
        //      /  \
        //    2     3
        //   / \     \
        //  4   5     6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        ArrayList<Integer> res = new ArrayList<>();
        inOrder(root,res);
        for(int node: res){
            System.out.println(node + " ");
        }


    }
}
