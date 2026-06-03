package NEETCODE.TREES.BST;

import java.util.ArrayList;
import java.util.List;

public class TwoSumIV {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            left = right = null;
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        //Step2: Two Pointer
        int left = 0;
        int right = list.size()-1;
        while(left<right){
            int sum = list.get(left) + list.get(right);
            if(sum==k){
                return true;
            }else if(sum<k){
                left++;
            }else{
                right--;
            }
        }
        return false;

    }

    private void inorder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);//Stored order me add hoga
        inorder(root.right, list);
    }

    public static void main(String[] args) {

    }
}
