package Binary_Tree;

import java.util.ArrayList;

public class LevelOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            data = x;
            left=right= null;
        }
    }

    public static void traversal(Node root, int level, ArrayList<ArrayList<Integer>> res )
    {//base case
        if(root ==null ){
            return;
        }
        //ADd a new label to the result if needed
        if(res.size() <= level){
            res.add(new ArrayList<>());
        }
        //Add current node data to it's corresponding level
        res.get(level).add(root.data);
        //Recure for left and right children
        traversal(root.left, level+1, res);
        traversal(root.right, level+1, res);

    }

    public static void main(String[] args) {
        //      5
        //     / \
        //   12   13
        //   /  \    \
        //  7    14   2
        // / \  /  \  / \
        //17 23 27 3  8  11

        Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);


        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (ArrayList<Integer> level : res) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
