package Binary_Tree;
import java.util.HashMap;
import java.util.Map;

public class ConstructBTFromPreOrder {
    public TreeNode built(int[] preOrder, int[] inOrder){
        ///  Map to store value-> index from inorder
        Map<Integer, Integer> inMap= new HashMap<>() ;
        for(int i = 0;i<inOrder.length;i++){
            inMap.put(inOrder[i], i);

        }
        //Start a recursive construction
        return buildTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1, inMap);

    }

    private TreeNode buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        //Base condition
        if(preStart>preEnd ||inStart > inEnd){
            return null;
        }
        /// First element of the preOrder is the root
        TreeNode root = new TreeNode(preOrder[preStart]);
        // Get inorder index of root
        int inRoot = inMap.get(root.data);
        int numsLeft = inRoot - inStart;

        //Build left and right subtree
        root.left = buildTree(preOrder, preStart+1, preStart + numsLeft, inOrder, inStart,inRoot-1, inMap);
        root.right = buildTree(preOrder, preStart + numsLeft+1,preEnd, inOrder,inRoot + 1, inEnd,inMap);
        return root;

    }
}
