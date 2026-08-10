package NEETCODE.GREEDY;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Nmeetings {
    public static List<Integer> maxMeeting(int[] start, int[] end) {
        //Store meeting as {end_time, sta_time, meeting_num} so that we get easy to sort accoding to endTime
        List<int[]> meetings = new ArrayList<>();
        for(int i=0;i<start.length;i++ ){
            meetings.add(new int[]{end[i], start[i], i + 1});
        }
        //Sort by end
        meetings.sort(Comparator.comparingInt(a->a[0]));
        //create a result list to sotore value
        List<Integer> result = new ArrayList<>();
        int lastAccupied = -1;
        for(int[]  m: meetings){
            //if meeting is scheduled
            if(m[1] > lastAccupied){
                //store original index
                result.add(m[2]);
                //Update last meeting end time
                lastAccupied = m[0];

            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};
        List<Integer> res =  maxMeeting(start, end);
        for (int idx : res) {
            System.out.print(idx + " ");
        }
    }
}
