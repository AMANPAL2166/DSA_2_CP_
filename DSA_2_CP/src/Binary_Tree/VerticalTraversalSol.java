package Binary_Tree;

public class VerticalTraversalSol {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data = val;
            left = right = null;
        }
    }
    //make class for pair
    class Pair{
        Node node;
        int vertical;
        int level;
        Pair(Node n, int v, int l) {
            node = n;
            vertical = v;
            level = l;
        }
    }
    public static List<List<Integer>> verticalTraversal(Node root){
        //use treee map to store the vertical level mapping
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodes = new TreeMap();
        //Queue for BFS
        Queue<Pair> todo = new Linkedlist<>();
        todo.add(new Pair(root,0,0));
        //perform BFS
        while (!todo.isEmpty()){
            Pair p = todo.poll();
            Node temp = p.node;
            int x= p.vertical;
            int y = p.level;
            // Add node value to map
            nodes.putIfAbsent(x, new TreeMap<>());
            nodes.get(x).putIfAbsent(y, new PriorityQueue<>());
            nodes.get(x).get(y).offer(temp.data);

            // If left child exists, push to queue
            if (temp.left != null) {
                todo.offer(new Pair(temp.left, x - 1, y + 1));
            }

            // If right child exists, push to queue
            if (temp.right != null) {
                todo.offer(new Pair(temp.right, x + 1, y + 1));
        }
            // Final answer
            List<List<Integer>> ans = new ArrayList<>();

            // Iterate through map to build result
            for (TreeMap<Integer, PriorityQueue<Integer>> ys : nodes.values()) {
                List<Integer> col = new ArrayList<>();
                for (PriorityQueue<Integer> pq : ys.values()) {
                    while (!pq.isEmpty()) {
                        col.add(pq.poll());
                    }
                }
                ans.add(col);
            }

            return ans;
    }
}