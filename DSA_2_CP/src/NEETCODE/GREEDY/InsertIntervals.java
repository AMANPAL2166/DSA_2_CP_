package NEETCODE.GREEDY;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
       // int[][] res = new int[n][];//There should be list
        List<int[]> res  = new ArrayList<>();
        int i =0;//to track index
        //left
        while(i<n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        //right
        while(i<n && intervals[i][0] < newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        // Convert List<int[]> to 2D array and return
        return res.toArray(new int[res.size()][]);

    }
}
