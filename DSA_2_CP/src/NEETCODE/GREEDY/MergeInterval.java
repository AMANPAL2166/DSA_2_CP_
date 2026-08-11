package NEETCODE.GREEDY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static int[][] mergeInterval(int[][] intervals) {
        //Sort array based on starting point
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        //create a list to store ans
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;//interval length
        int i = 0;
        //loop through intervals
        while (i<n){
            //start of merged interval
            int start = intervals[i][0];
            int end = intervals[i][1];
            int j = i+1;
            //check all non-overlapping intervals
            while(j<n && intervals[j][0] <=end){
                //Extend the end of current intervals
                end = Math.max(end, intervals[j][1]);
                j++;
            }
            //Add merge intervals to the result
            //res.add(new ArrayList<(start,end)>);
            //MOve to next non-overlapping intervals
        }
        return res.toArray(new int[res.size()][] );

    }
}
