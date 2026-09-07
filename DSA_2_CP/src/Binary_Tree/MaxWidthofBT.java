package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class MaxWidthofBT {
    public class Node{
        Node left,right;
        int data;
        Node(int val){
            data = val;
            left=right= null;
        }
    }
    static class Pair<K, V> {
        K key;

        V value;
        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() { return key; }
        public V getValue() { return value; }
    }
    int widthofBinaryTree(Node root){
        //base case
        if(root == null) return 0;
        //initialize max width
        int maxWidth = 0;
        //Queue to store node and its index
        Queue<Pair<Node, Integer>> q = new LinkedList<>();
        //Pair
        q.add(new Pair(root,0));

        // BFS traversal
        while (!q.isEmpty()) {

            // Get size of current level
            int size = q.size();

            // Get the minimum index at this level
            int minIndex = q.peek().getValue();

            // Variables to store first and last index
            int first = 0, last = 0;

            // Traverse all nodes in this level
            for (int i = 0; i < size; i++) {

                // Get current node and index
                Pair<Node, Integer> p = q.poll();
                Node node = p.getKey();
                int currIndex = p.getValue() - minIndex;

                // Update first index
                if (i == 0)
                    first = currIndex;

                // Update last index
                if (i == size - 1)
                    last = currIndex;

                // Push left child if exists
                if (node.left != null)
                    q.offer(new Pair<>(node.left,
                            2 * currIndex + 1));

                // Push right child if exists
                if (node.right != null)
                    q.offer(new Pair<>(node.right,
                            2 * currIndex + 2));
            }

            // Update maximum width
            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        // Return the final result
        return maxWidth;
    }
}
