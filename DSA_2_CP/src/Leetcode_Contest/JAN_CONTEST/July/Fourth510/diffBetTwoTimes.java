package Leetcode_Contest.JAN_CONTEST.July.Fourth510;

public class diffBetTwoTimes {
    public static int secondsBetweenTimes(String startTime, String endTime) {
        String[] start = startTime.split(":" );
        String[] end= endTime.split(":");
        int hStart = Integer.parseInt(start[0]);
        int mStart = Integer.parseInt(start[1]);
        int sStart = Integer.parseInt(start[2]);
        int startTimeInSec = hStart*3600 + mStart*60 + sStart;
        int hEnd = Integer.parseInt(end[0]);
        int mEnd = Integer.parseInt(end[1]);
        int sEnd = Integer.parseInt(end[2]);
        int endTimeInSec = hEnd*3600 + mEnd*60 + sEnd;
        return endTimeInSec - startTimeInSec  ;
    }

    public static void main(String[] args) {
        String startTime = "01:00:00", endTime = "01:00:25";
        System.out.println(secondsBetweenTimes(startTime,endTime));
    }
}
