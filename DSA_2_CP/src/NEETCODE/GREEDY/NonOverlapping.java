package NEETCODE.GREEDY;

import java.util.Arrays;

public class NonOverlapping {
    public static int overlapCount(int[][] intervals){
        int res = 0;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int prev_end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (prev_end > intervals[i][0]) {
                res++;
            } else {
                prev_end = intervals[i][1];
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 100}, {11,22}, {1,11}, {2,12}};
        System.out.println(overlapCount(intervals));
    }
}
