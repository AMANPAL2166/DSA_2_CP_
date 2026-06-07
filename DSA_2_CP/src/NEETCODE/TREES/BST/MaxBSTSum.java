package NEETCODE.TREES.BST;

public class MaxBSTSum {
     static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            left = right = null;
        }
    }
    static int maxSum = 0;
    static class Info{
        boolean isBST;
        int min;
        int max;
        int sum;
        Info(boolean isBST, int max, int min, int sum ){
            this.isBST = isBST;
            this.max = max;
            this.min = min;
            this.sum = sum;
        }


    }
    public  static   int maxSumBST(TreeNode root){
        dfs(root);
        return maxSum;
    }
    private static   Info dfs(TreeNode node) {

        if (node == null) {
            return new Info(
                    true,
                    Integer.MAX_VALUE,
                    Integer.MIN_VALUE,
                    0
            );
        }

        Info left = dfs(node.left);
        Info right = dfs(node.right);

        if (left.isBST &&
                right.isBST &&
                node.val > left.max &&
                node.val < right.min) {

            int currSum =
                    left.sum + right.sum + node.val;

            maxSum = Math.max(maxSum, currSum);

            int currMin =
                    Math.min(node.val, left.min);

            int currMax =
                    Math.max(node.val, right.max);

            return new Info(
                    true,
                    
                    currMin,
                    currMax,
                    currSum
            );
        }

        return new Info(
                false,
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                0
        );
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        dfs(root);

        System.out.println("Max Sum = " + maxSum);

    }
}
