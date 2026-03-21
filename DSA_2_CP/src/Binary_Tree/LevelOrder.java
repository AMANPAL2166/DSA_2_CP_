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


    }
}
