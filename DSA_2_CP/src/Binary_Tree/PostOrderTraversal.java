package Binary_Tree;

import java.util.ArrayList;

public class PostOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            data = x;
            left=right=null;
        }

    }

    public static void postOrder(Node node, ArrayList<Integer> res) {
        if(node==null){
            return;
        }
        //first traverse left subtree
        postOrder(node.left,res);
        //then traverse right subtree
        postOrder(node.right, res);
        //now we visit node;
        res.add(node.data);

    }

    public static void main(String[] args) {
        //Represent Tree
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        ArrayList<Integer> result = new ArrayList<>();
        postOrder(root, result);
        //Print postOrder
        for(int res: result){
            System.out.print(res+" ");
        }
    }

}
