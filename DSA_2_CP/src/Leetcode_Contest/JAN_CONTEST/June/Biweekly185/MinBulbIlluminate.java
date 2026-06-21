package Leetcode_Contest.JAN_CONTEST.June.Biweekly185;

public class MinBulbIlluminate {
    public static int minLights(int[] lights) {
        int n = lights.length;
        boolean[] covered = new boolean[n];
        for(int i = 0;i<n;i++){
            if(lights[i]>0){
                int start = Math.max(0, i-lights[i]);
                int end = Math.min(n-1, i+lights[i]);
                for(int j = start;j<=end;j++){
                    covered[j] = true;
                }
            }
        }
        //track covered and uncovered
//        int length = 0;
//        int i = 0;
//        while(i<n && !covered[i]){
//            length++;
//            i++;
//        }
//        int ans = (length+2)/3;
//        return ans;
        int ans= 0;
        int i = 0;
        while(i<n){
            //covered position skip
            while(i<n && covered[i]){
                i++;
            }
            int len = 0;
            //covered segment count
            while(i<n && !covered[i]){
                len++;
                i++;
            }
            ans += (len+2)/3;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] lights = {0,0,0,2,0};
        int ans = minLights(lights);
        System.out.println(ans);
    }
}
