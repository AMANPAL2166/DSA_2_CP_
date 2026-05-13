package NEETCODE.MATH_and_GROMETRY;

import java.util.ArrayList;
import java.util.List;

public class DetectSquare {
    class DetectSquares {
        int[][] cnt = new int[1001][1001];
        List<int[]> points = new ArrayList<>();

        public DetectSquares() {}

        public void add(int[] point) {
            cnt[point[0]][point[1]]++; // Added missing brackets
            points.add(point);
        }

        public int count(int[] point) {
            int x1 = point[0], y1 = point[1];
            int res = 0;

            for (int[] p : points) {
                int x3 = p[0], y3 = p[1];

                // 1. Must have positive area (not same coordinate)
                // 2. Must be a square (dx == dy)
                if (Math.abs(x1 - x3) == 0 || Math.abs(x1 - x3) != Math.abs(y1 - y3)) {
                    continue;
                }

                // Check if the other two corners exist: (x1, y3) and (x3, y1)
                res += cnt[x1][y3] * cnt[x3][y1];
            }
            return res;
        }
    }

}
