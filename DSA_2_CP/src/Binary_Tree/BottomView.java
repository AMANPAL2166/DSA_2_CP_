package Binary_Tree;

import java.util.*;

public class BottomView {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data  = val;
            right  = left = null;
        }
    }
    static class Pair{
        Node node;
        int hd;
        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static ArrayList<Integer>  bottomview(Node root){
        //Arraylist to store ans
        ArrayList<Integer> ans = new ArrayList<>();
        //store level order traversal with vertical
        Queue<Pair> q = new LinkedList<>();
        //map to store nodes with it's verticess
        Map<Integer, Integer> map = new HashMap<>();
        if(root == null) return ans;
        //add root to the queue and initialize with 0
        q.add(new Pair(root,0));
        //BFS traversal
         while(!q.isEmpty()){
             Pair curr = q.poll();
             Node node = curr.node;
             int hd = curr.hd;
             map.put(hd, node.data);
             //if left node isn't null add node and (hd-1)
             if(node.left != null){
                 q.add(new Pair(node, hd-1));
             }
             //same here but verticess are changed (hd+1)
             if(node.right != null){
                 q.add(new Pair(node, hd+1));
             }
         }
         for(int value: map.values()){
             ans.add(value);
         }
         return ans;

    }
}
