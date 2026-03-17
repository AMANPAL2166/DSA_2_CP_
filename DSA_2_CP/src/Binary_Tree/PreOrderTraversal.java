package Binary_Tree;

import java.util.ArrayList;

public class PreOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        //constructor
        Node (int x){
            data = x;
            left=right=null;
        }
    }

    public static void PreOrder(Node node, ArrayList<Integer> res) {
        //base case
        if(node == null){
            return;
        }
        //visit the current node first
        res.add(node.data);
        //traverse the left subtree
        PreOrder(node.left, res);
        //traverse the right subtree
        PreOrder(node.right, res);


    }

    public static void main(String[] args) {
        // Create binary tree
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
        ArrayList<Integer> reult = new ArrayList<>();
        PreOrder(root,reult);
        for(int val: reult){
            System.out.println(val + " ");
        }

    }
}
