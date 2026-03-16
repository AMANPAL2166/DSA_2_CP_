package Daily_Question;

import java.util.Collections;
import java.util.TreeSet;

/// You are given an m x n integer matrix grid​​​.
///
/// A rhombus sum is the sum of the elements that form the border of a regular rhombus shape in grid​​​. The rhombus must have the shape of a square rotated 45 degrees with each of the corners centered in a grid cell. Below is an image of four valid rhombus shapes with the corresponding colored cells that should be included in each rhombus sum:
///
///
/// Note that the rhombus can have an area of 0, which is depicted by the purple rhombus in the bottom right corner.
///
/// Return the biggest three distinct rhombus sums in the grid in descending order. If there are less than three distinct values, return all of them.
///
///
///
/// Example 1:
///
///
/// Input: grid = [[3,4,5,1,3],[3,3,4,2,3],[20,30,200,40,10],[1,5,5,4,1],[4,3,2,2,5]]
/// Output: [228,216,211]
/// Explanation: The rhombus shapes for the three biggest distinct rhombus sums are depicted above.
/// - Blue: 20 + 3 + 200 + 5 = 228
/// - Red: 200 + 2 + 10 + 4 = 216
/// - Green: 5 + 200 + 4 + 2 = 211
/// Example 2:
///
///
/// Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
/// Output: [20,9,8]
/// Explanation: The rhombus shapes for the three biggest distinct rhombus sums are depicted above.
/// - Blue: 4 + 2 + 6 + 8 = 20
/// - Red: 9 (area 0 rhombus in the bottom right corner)
/// - Green: 8 (area 0 rhombus in the bottom middle)
/// Example 3:
///
/// Input: grid = [[7,7,7]]
/// Output: [7]
/// Explanation: All three possible rhombus sums are the same, so return [7].
///
///
/// Constraints:
///
//  Kuch Zaruri
//  Points:Time Complexity: $O(M \cdot N \cdot \min(M, N))$, kyunki grid chota hai ($50 \times 50$), toh ye aaram se pass ho jayega.
//  Corner Handling: Code mein jo loops hain wo har side ke $r$ elements add karte hain.
//  Isse charo corners (Top, Bottom, Left, Right) ek-ek baar hi add hote hain, koi duplicate nahi hota.Space Complexity:
//  Hum sirf ek set use kar rahe hain, toh space $O(M \cdot N)$ hoga max.

public class BiggestThreeRoumbusSum {
    public  static int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // TreeSet to store unique sums in descending order
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Har cell size 0 ka rhombus hai
                set.add(grid[i][j]);

                // Larger rhombuses check karte hain
                for (int r = 1; i + 2 * r < m && j - r >= 0 && j + r < n; r++) {
                    int sum = 0;

                    // Charo sides ka sum nikalte hain (corners ka dhyan rakhte hue)
                    // Side 1: Top to Right
                    for (int k = 0; k < r; k++) sum += grid[i + k][j + k];
                    // Side 2: Right to Bottom
                    for (int k = 0; k < r; k++) sum += grid[i + r + k][j + r - k];
                    // Side 3: Bottom to Left
                    for (int k = 0; k < r; k++) sum += grid[i + 2 * r - k][j - k];
                    // Side 4: Left to Top
                    for (int k = 0; k < r; k++) sum += grid[i + r - k][j - r + k];

                    set.add(sum);
                }
            }
        }

        // Top 3 distinct values pick karte hain
        int size = Math.min(set.size(), 3);
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = set.pollFirst();
        }
        return result;
    }
}
