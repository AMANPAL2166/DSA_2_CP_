package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightAndLeftView {
    //problem statement is view from left and right of a tree
    //solN:: traverse BFS  and get.size()-1 == right view of treee and git 0 value of list of list is your left view
    //Let's solve together
    class Node{
        int data;
        Node left, right;
        Node(int val){
            this.data = val;
            left = right = null;
        }
        public static List<List<Integer>> levelOrder(Node root){
            //
            List<List<Integer>> ans = new ArrayList<>();
            if(root == null) return ans;
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            while(!q.isEmpty() ){
                int size = q.size();
                List<Integer> list =new ArrayList<>();
                for(int i = 0;i<size;i++){
                    //remove node from queue
                    Node node = q.poll();
                    //add it's data to current level
                    list.add(node.data);
                    //add left child if exit
                    if(node.left != null){
                        q.add(node.left);
                    }
                    if(node.right != null){
                        q.add(node.right);
                    }
                }
                ans.add(list);

            }
            return ans;
        }
        public static List<Integer> leftView(Node root){
            List<List<Integer>> levelOrder = levelOrder(root);
            List<Integer> ans = new ArrayList<>();
            for(List<Integer> val: levelOrder){
                ans.add(val.get(0));
            }
            return ans;
        }
        public static List<Integer> rightView(Node root){
            List<List<Integer>> levelOrder = levelOrder(root);
            List<Integer> ans = new ArrayList<>();
            for(List<Integer> val: levelOrder){
                ans.add(val.get(levelOrder.size()-1));
            }
            return ans;
        }
    }

}
