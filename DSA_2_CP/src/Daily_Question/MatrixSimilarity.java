package Daily_Question;
/// 2946

public class MatrixSimilarity {
    public static boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        // Agar k, m se bada hai toh unnecessary rotations hatane ke liye
        k = k % m;
        if (k == 0) return true; // No effective shift

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Har element ko uski shifted position se compare karo
                // Logic: mat[i][j] should be equal to mat[i][(j + k) % m]
                if (mat[i][j] != mat[i][(j + k) % m]) {
                    return false;
                }
            }
        }

        return true;
    }

}
