package Daily_Question;

public class CountSubmatrix {
    class Solution {
        public static int countSubmatrices(int[][] grid, int k) {
            int n = grid.length;
            int m = grid[0].length;
            int count = 0;

            // 2D Prefix Sum matrix create karenge
            int[][] pref = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // Formula: Current + Left + Up - Diagonal (to avoid double counting)
                    pref[i][j] = grid[i][j];

                    if (i > 0) pref[i][j] += pref[i-1][j]; // Upar wala sum add kiya
                    if (j > 0) pref[i][j] += pref[i][j-1]; // Left wala sum add kiya
                    if (i > 0 && j > 0) pref[i][j] -= pref[i-1][j-1]; // Common area subtract kiya

                    // Agar sum k ke barabar ya chhota hai, toh count badhao
                    if (pref[i][j] <= k) {
                        count++;
                    } else {
                        // Optimization: Agar current row mein sum k se bada ho gaya,
                        // toh aage ke columns mein bhi bada hi hoga (since values positive hain)
                        break;
                    }
                }
            }

            return count;
        }
    }
}
