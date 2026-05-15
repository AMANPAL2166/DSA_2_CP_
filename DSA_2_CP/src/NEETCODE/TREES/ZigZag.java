package NEETCODE.TREES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag
{
    public static class NodeTree{
        int val;
        NodeTree left;
        NodeTree right;
        NodeTree(int x){
            val = x;
            right = null;
            left = null;
        }
    }
    public static List<List<Integer>> zigZag(NodeTree root){
        List<List<Integer>> ans= new ArrayList<>();
        //base case
        if(root == null) return ans;
        Queue<NodeTree> queue = new LinkedList<>();
        queue.add(root);
        //flag to keep  track of direction
        boolean leftToRight = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            //using deque and linkedlist better for O(1) for front insertation
            LinkedList<Integer> currentLevel = new LinkedList<>();
            for(int i = 0;i<size;i++){
                NodeTree node= queue.poll();
                if(leftToRight){
                    currentLevel.addLast(node.val);//normal order (add in end)

                }else{
                    currentLevel.addFirst(node.val);//reverse order(end at beginning)
                }if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            ans.add(currentLevel);
            leftToRight = !leftToRight;//Flip the direction
        }
        return ans;


    }
}

