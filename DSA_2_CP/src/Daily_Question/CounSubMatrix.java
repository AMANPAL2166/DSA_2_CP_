package Daily_Question;

//Given a 2D character matrix grid, where grid[i][j] is either 'X', 'Y', or '.', return the number of submatrices that contain:
//
//grid[0][0]
//an equal frequency of 'X' and 'Y'.
//at least one 'X'.
//
//
//Example 1:
//
//Input: grid = [["X","Y","."],["Y",".","."]]
//
//Output: 3
/// Code ka Breakdown:
/// 3D Array ka Use (sum[n+1][m+1][2]):
///
/// Aapne ek 3D array banaya hai jahan har cell (i, j) par do values store ho rahi hain.
///
/// index [0]: Isme aap 'X' aur 'Y' ka difference store kar rahe hain (countX - countY).
///
/// index [1]: Isme aap ye check kar rahe hain ki kya us submatrix mein kam se kam ek 'X' aaya hai ya nahi (1 for yes, 0 for no).
///
/// Prefix Sum ka Formula:
///
/// Aapne wahi standard formula lagaya hai: Current + Up + Left - Diagonal.
///
/// Case 'X': Aap difference mein +1 kar rahe hain aur sum[...][1] ko 1 set kar rahe hain (X mil gaya).
///
/// Case 'Y': Aap difference mein -1 kar rahe hain.
///
/// Answer Calculation:
///
/// ans += (sum[i + 1][j+1][0] == 0 && sum[i + 1][j+1][1] == 1) ? 1 : 0;
///
/// == 0: Iska matlab countX - countY = 0, yani dono barabar hain.
///
/// == 1: Iska matlab us area mein at least ek 'X' present hai.
public class CounSubMatrix {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        int[][][] sum = new int[n + 1][m + 1][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'X') {
                    sum[i + 1][j + 1][0] =
                            sum[i + 1][j][0] + sum[i][j + 1][0] - sum[i][j][0] + 1;
                    sum[i + 1][j + 1][1] = 1;
                } else if (grid[i][j] == 'Y') {
                    sum[i + 1][j + 1][0] =
                            sum[i + 1][j][0] + sum[i][j + 1][0] - sum[i][j][0] - 1;
                    sum[i + 1][j + 1][1] = sum[i + 1][j][1] | sum[i][j + 1][1];
                } else {
                    sum[i + 1][j + 1][0] =
                            sum[i + 1][j][0] + sum[i][j + 1][0] - sum[i][j][0];
                    sum[i + 1][j + 1][1] = sum[i + 1][j][1] | sum[i][j + 1][1];
                }
                ans += (sum[i + 1][j + 1][0] == 0 && sum[i + 1][j + 1][1] == 1)
                        ? 1
                        : 0;
            }
        }
        return ans;
    }
}
