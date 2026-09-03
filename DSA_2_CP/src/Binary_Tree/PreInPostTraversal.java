package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class PreInPostTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data = val;
            left = null;
            right = null;
        }
    }
    //function to print list
    public static void printLIst(List<Integer> ans) {
        for(int num: ans){
            System.out.print(num + " ");
        }

    }
    public static void  preOrder(Node root, ArrayList<Integer> preOrd){

        //if root == null return
        if(root == null){
            return;
        }
        preOrd.add(root.data);
        preOrder(root.left, preOrd);
        preOrder(root.right, preOrd);
    }
    public static void  InOrder(Node root, ArrayList<Integer> preOrd){

        //if root == null return
        if(root == null){
            return;
        }
        InOrder(root.left, preOrd);
        preOrd.add(root.data);
        InOrder(root.right, preOrd);
    }
    public static void  postOrder(Node root, ArrayList<Integer> preOrd){

        //if root == null return
        if(root == null){
            return;
        }
        postOrder(root.left, preOrd);
        postOrder(root.right, preOrd);
        preOrd.add(root.data);
    }



    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // Extracting the traversals
        ArrayList<Integer> pre = new ArrayList<>();
        preOrder(root,pre);
        ArrayList<Integer> in = new ArrayList<>();
        InOrder(root, in);
        ArrayList<Integer> post = new ArrayList<>();
        postOrder(root, post);
        System.out.println("Pre Order Traversal");
        printLIst(pre);
        System.out.println();
        System.out.println("In order Traversal ");
        printLIst(in);
        System.out.println();
        System.out.println("Post order Traversal ");
        printLIst(post);

    }
}
