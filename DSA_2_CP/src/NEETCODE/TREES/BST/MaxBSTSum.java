package NEETCODE.TREES.BST;



public class MaxBSTSum {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
            left = right = null;
        }
    }
    int maxSum = 0;
    class Info{
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
    public int maxSunbst(TreeNode root){
        dfs(root);
        return maxSum;
    }
    private Info dfs(TreeNode node) {

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
}
