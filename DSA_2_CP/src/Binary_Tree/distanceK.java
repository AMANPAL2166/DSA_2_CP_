package Binary_Tree;

import java.util.*;

public class distanceK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root == null){
            return new ArrayList<>();
        }
        //Step 1: Build parent reference using BFS
        Map<TreeNode,TreeNode> parentMap = new HashMap<>();
        mapParents(root,parentMap);
        //Step 2: Perform BFS from target to find all nodes at distance k
        return bfsfromTarget(target,parentMap,k);
    }

    private List<Integer> bfsfromTarget(TreeNode target, Map<TreeNode, TreeNode> parentMap, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> visited = new LinkedList<>();
        queue.offer(target);
        visited.add(target);
        int currentLevel = 0;
        //Standard BFS
        while (!queue.isEmpty()){
            int size = queue.size();
            //Stop traversal once we reached to the k
            if(currentLevel++ == k)break;
            for(int i= 0;i<size;i++){
                TreeNode node = queue.poll();

                // Explore left child
                if (node.left != null && !visited.contains(node.left)) {
                    visited.add(node.left);
                    queue.offer(node.left);
                }

                // Explore right child
                if (node.right != null && !visited.contains(node.right)) {
                    visited.add(node.right);
                    queue.offer(node.right);
                }

                // Explore parent from map
                if (parentMap.containsKey(node) && !visited.contains(parentMap.get(node))) {
                    visited.add(parentMap.get(node));
                    queue.offer(parentMap.get(node));
                }
            }
        }
        // All nodes left in queue are exactly K distance from target
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().data);
        }

        return result;


    }

    private void mapParents(TreeNode root, Map<TreeNode, TreeNode> parentMap) {
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            //Record left child parent's
            if(root.left != null){
                parentMap.put(root.left, node);
                q.offer(node.left);
            }
            if(root.right != null){
                parentMap.put(root.right, node);
                q.offer(node.right);
            }
        }
    }
}
