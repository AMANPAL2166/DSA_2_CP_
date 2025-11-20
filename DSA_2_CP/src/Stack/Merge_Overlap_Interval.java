package Stack;

import java.util.Arrays;

public class Merge_Overlap_Interval {
    public static void main(String[] args) {
        int[][] array = {
                {1, 3 },
                {2, 6 },
                {8, 10 },
                {15, 18 }
        };
        solve(array);

    }

    public static void solve(int[][] arr) {

        for(int i = 0; i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]) );
            for(int j= 0; j<arr[i].length; i++){
                System.out.println(Arrays.toString(arr[j]));
            }
        }


    }
}
