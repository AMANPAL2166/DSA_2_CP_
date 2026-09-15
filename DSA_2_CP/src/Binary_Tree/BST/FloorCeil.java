package Binary_Tree.BST;
import Binary_Tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class FloorCeil {
    public List<Integer> flooAndCeil(TreeNode root, int key){
        int floor = -1;
        int ceil = -1;
        List<Integer> ans = new ArrayList<>();
       // if(root == null) return ans;
        TreeNode curr = root;
        //ceil
        while (curr != null){
            if(curr.data == key){
                ceil = curr.data;
                break;
            } else if (curr.data > key) {
                ceil = curr.data;
                curr = curr.left;
            }else {
                curr = curr.right;
            }
        }
        //floor
        while (curr != null){
            if(curr.data == key){
                floor = curr.data;
                break;
            } else if (curr.data < key) {
                floor = curr.data;
                curr = curr.right;
            }else {
                curr = curr.left;
            }
        }
        ans.add(floor);
        ans.add(ceil);
        return ans;

    }
}
