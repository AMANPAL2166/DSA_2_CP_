package Binary_Tree;

public class BuildTreePreorder {
    static class Node{
        int data;
        Node left;
        Node right;
        //constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    public static class BinaryTree{
        static  int idx = -1;

        public static Node buildTree(int  node[]) {
            idx++;
            //check
            if(node[idx] == -1){
                return null;
            }
            //create a new node
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;

        }
    }

    public static void main(String[] args) {
        int node[] = {9,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data);
    }
}
