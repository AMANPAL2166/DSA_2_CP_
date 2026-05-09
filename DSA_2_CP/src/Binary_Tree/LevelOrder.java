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
}
