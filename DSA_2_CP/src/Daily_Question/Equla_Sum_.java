package Daily_Question;
///  3548. problem number
public class Equla_Sum_ {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long[][] pref = new long[n + 1][m + 1];

        // 1. Build 2D Prefix Sum Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pref[i + 1][j + 1] = grid[i][j] + pref[i][j + 1] + pref[i + 1][j] - pref[i][j];
            }
        }

        long totalSum = pref[n][m];

        // 2. Check Horizontal Cuts (Row-wise)
        for (int i = 1; i < n; i++) {
            long topSum = pref[i][m];
            long bottomSum = totalSum - topSum;

            // Discount can be from Top section OR Bottom section
            if (checkWithDiscount(grid, 0, i - 1, 0, m - 1, topSum, bottomSum) ||
                    checkWithDiscount(grid, i, n - 1, 0, m - 1, bottomSum, topSum)) {
                return true;
            }
        }

        // 3. Check Vertical Cuts (Column-wise)
        for (int j = 1; j < m; j++) {
            long leftSum = pref[n][j];
            long rightSum = totalSum - leftSum;

            // Discount can be from Left section OR Right section
            if (checkWithDiscount(grid, 0, n - 1, 0, j - 1, leftSum, rightSum) ||
                    checkWithDiscount(grid, 0, n - 1, j, m - 1, rightSum, leftSum)) {
                return true;
            }
        }

        return false;
    }

    private boolean checkWithDiscount(int[][] grid, int r1, int r2, int c1, int c2, long currentSum, long targetSum) {
        // Case: Sums are already equal
        if (currentSum == targetSum) return true;

        // Case: Discount one cell to make currentSum == targetSum
        long diff = currentSum - targetSum;
        if (diff <= 0) return false; // Discounted value must be positive (since grid has positive integers)

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                if ((long)grid[i][j] == diff) {
                    // Critical: Check if removing this cell maintains connectivity in the sub-rectangle
                    if (isSafeToRemove(i, j, r1, r2, c1, c2)) return true;
                }
            }
        }
        return false;
    }

    private boolean isSafeToRemove(int r, int c, int r1, int r2, int c1, int c2) {
        int rows = r2 - r1 + 1;
        int cols = c2 - c1 + 1;

        // If the section is a single row or column (1D)
        if (rows == 1 || cols == 1) {
            // Only the two ends are safe to remove to keep it connected
            return (r == r1 && c == c1) || (r == r2 && c == c2);
        }

        // In a 2D rectangle (rows > 1 AND cols > 1), any boundary cell is safe
        // because the rest of the block remains a single connected component.
        // If it's an internal cell, it's NOT safe (it's a cut-vertex for the grid).
        return (r == r1 || r == r2 || c == c1 || c == c2);
    }
}
