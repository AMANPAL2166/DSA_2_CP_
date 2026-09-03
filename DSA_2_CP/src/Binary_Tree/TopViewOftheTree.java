package Binary_Tree;

import com.sun.jdi.ArrayReference;

import java.util.*;

public class TopViewOftheTree {
    class Node{
        int data;
        Node left, right;
        Node(int data ){
            this.data = data;
           right = left = null;
        }
    }
     static  class Pair{
        Node node;
        int hd;
        Pair(Node node , int hd){
            this.hd = hd;
            this.node = node;
        }
    }
    public static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans= new ArrayList<>();
        if(root == null) return ans;
        //create a queue ds because need to traverse levell order
        Queue<Pair> q = new LinkedList<>() ;
        Map<Integer, Integer> map = new HashMap<>();
        //add root and hd to the q
        q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair curr =q.poll();
            Node node = curr.node;
            int hd = curr.hd;
            //check left node and (hd-1)
            if(node.left != null){
                q.add(new Pair(node.left,hd-1));
            }
            if(node.right!= null){
                q.add(new Pair(node.right, hd+1));
            }
        }
        for(int value: map.values()){
            ans.add(value);
        }
        return ans;


    }
}
