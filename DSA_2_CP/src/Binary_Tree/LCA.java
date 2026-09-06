package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class LCA {
    class Node{
        int data;
        Node left, right;
        Node(int val){
            this.data = val;
            left = right = null;
        }
    }
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        //Base case
        if(root== null || root == p || root == q){
            return root;
        }
        //SEarch in left and right subtreee
        Node left = lowestCommonAncestor(root.left, p,q);
        Node right = lowestCommonAncestor(root.right, p,q);
        if(left == null)return right;
        if (left == null) return left;
        return root;
    }
    //solve using root to path method
    private boolean getPath(Node root, List<Integer> ans, int x) {
        if(root == null){
            return false;
        }
        //Add current val into arraylist
        ans.add(root.data);
        //check
        if(root.data == x){
            return true;
        }
        //run preorder traversal
        if(getPath(root.left,ans,x) || getPath(root.right,ans, x))return true;
        //if we didn't find target node then backtrack from that root node
        ans.remove(ans.size()-1);
        return false;
    }

//    private Node lca(Node root, int p, int q){
//        List<Integer> list1 = new ArrayList<>();
//        getPath(root, list1,p);
//        List<Integer> list2 = new ArrayList<>();
//        getPath(root,list2,q);
//        for(int i = 0;i<Math.max(list2.size(), list1.size());i++){
//            if(list2.get(i) != list1.get(i)){
//                //return list2.get(i-1);
//            }
//        }
//    }
}
