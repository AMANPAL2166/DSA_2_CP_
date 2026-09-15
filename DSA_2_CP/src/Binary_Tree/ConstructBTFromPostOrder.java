package Binary_Tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBTFromPostOrder {
    public TreeNode built(int[] postOrder, int[] inOrder){
        ///  Map to store value-> index from inorder
        Map<Integer, Integer> inMap= new HashMap<>() ;
        for(int i = 0;i<inOrder.length;i++){
            inMap.put(inOrder[i], i);

        }
        //Start a recursive construction
        return buildTree(postOrder, 0, postOrder.length-1, inOrder, 0, inOrder.length-1, inMap);

    }

    private TreeNode buildTree(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        //Base condition
        if(postStart>postEnd ||inStart > inEnd){
            return null;
        }
        /// First element of the preOrder is the root
        TreeNode root = new TreeNode(postOrder[postEnd]);
        // Get inorder index of root
        int inRoot = inMap.get(root.data);
        int numsLeft = inRoot - inStart;

        //Build left and right subtree
        root.left = buildTree(postOrder, postStart+1, postStart + numsLeft - 1, inOrder, inStart,inRoot-1, inMap);
        root.right = buildTree(postOrder, postStart + numsLeft,postEnd, inOrder,inRoot + 1, inEnd,inMap);
        return root;

    }
}
