package Binary_Tree;

import java.util.ArrayList;
import java.util.Stack;

//import static NEETCODE.TREES.PreOrderTraversal.ans;

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

    public static void PostOrder(Node root) {
        //solve using 2 stackj
        ArrayList<Integer> ans=new ArrayList<>();
        if(root == null){
            return ;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().data);
        }

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
