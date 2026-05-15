package NEETCODE.TREES;

import java.util.List;
import java.util.*;

public class PosibleBinaryTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            left=null;
            right = null;
        }
    }
    Map<Integer,List<TreeNode>> memo = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        //1: Agar n even hai , toh BFT possible hi nahi hai
        if(n % 2 == 0) {
            return new ArrayList<>();

        }
        //2: If result has calculated (Memoization)
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        List<TreeNode> res = new ArrayList<>();
        //3: Base case : If n==1, toh only leaf node will make
        if(n==1){
            res.add(new TreeNode(0));
            return res;
        }
        // 4. DFS Logic: Har possible left aur right combinations check karo
        // i nodes left mein, toh (n - 1 - i) nodes right mein bachenge
        // i hamesha odd hoga (1, 3, 5...)
        for (int i = 1; i < n; i += 2) {
            List<TreeNode> leftSubtrees = allPossibleFBT(i);
            List<TreeNode> rightSubtrees = allPossibleFBT(n - 1 - i);

            // Har left aur right tree ka combination banao
            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }

        // Result ko memo mein store karo
        memo.put(n, res);
        return res;
    }

    public static void main(String[] args) {

    }
}
