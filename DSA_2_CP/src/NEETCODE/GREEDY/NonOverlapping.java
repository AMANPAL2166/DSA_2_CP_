package NEETCODE.GREEDY;

public class NonOverlapping {
    public static int overlapCount(int[][] intervals){
        //int startTime = 0;
        int endTime = 0;
        int count = 0;
        int intervalLen = intervals.length;
       // int intevalIthLen = intervals[0].length;
        for(int i = 0;i<intervalLen;i++){
             if(intervals[i][0] <endTime  ){
                 count++;

             }else{
                 if(endTime < intervals[i][1]){
                     endTime = intervals[i][1];
                 }

             }
        }
        return count;

    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 100}, {11,22}, {1,11}, {2,12}};
        System.out.println(overlapCount(intervals));
    }
}
