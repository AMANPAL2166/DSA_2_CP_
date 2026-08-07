package NEETCODE.TREES;

import java.util.*;

public class LevelOrder {
    static class  Node {
        int data;
        Node left, right;
        Node(int value)
        {
            data = value;
            left = null;
            right = null;
        }
    }


        void levelOrderRec(Node root, int level,
                           ArrayList<ArrayList<Integer>> res)
        {
            // Base case
            if (root == null)
                return;

            // Add a new level to the result if needed
            if (res.size() <= level)
                res.add(new ArrayList<>());

            // Add current node's data to its corresponding
            // level
            res.get(level).add(root.data);

            // Recur for left and right children
            levelOrderRec(root.left, level + 1, res);
            levelOrderRec(root.right, level + 1, res);
        }

        // Function to perform level order traversal
        ArrayList<ArrayList<Integer>> levelOrder(Node root)
        {

            // Stores the result level by level
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            levelOrderRec(root, 0, res);
            return res;
        }
        public static void main(String[] args)
        {
            //      5
            //     / \
            //   12   13
            //   /  \    \
            //  7    14   2
            // / \  /  \  / \
            //17 23 27 3  8  11

            Node root = new Node(5);
            root.left = new Node(12);
            root.right = new Node(13);

            root.left.left = new Node(7);
            root.left.right = new Node(14);

            root.right.right = new Node(2);

            root.left.left.left = new Node(17);
            root.left.left.right = new Node(23);

            root.left.right.left = new Node(27);
            root.left.right.right = new Node(3);

            root.right.right.left = new Node(8);
            root.right.right.right = new Node(11);

            LevelOrder tree = new LevelOrder();
            ArrayList<ArrayList<Integer>> res = tree.levelOrder(root);

            for (ArrayList<Integer> level : res) {
                for (int val : level) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
        public static void levelOrderTraversal(TreeNode root){
            Queue<TreeNode> treeNodeQueue = new LinkedList<>();
            //Start with first node
            treeNodeQueue.add(root);
            //Run while loop till the queue isn't empty.
            while (!treeNodeQueue.isEmpty()){
                TreeNode treeNode = treeNodeQueue.poll();
                //Print the value
                System.out.println(treeNode.val +" -> ");
                //Add left child
                if(treeNode.left != null){
                    treeNodeQueue.add(treeNode.left);
                }
                //add right child
                if(treeNode.right != null){
                    treeNodeQueue.add(treeNode.left);
                }
            }
        }
    }


