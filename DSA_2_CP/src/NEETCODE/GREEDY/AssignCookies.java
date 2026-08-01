package NEETCODE.GREEDY;

import java.util.Arrays;

public class AssignCookies {
    public static int assign(int[] greed, int[] size){
        int n = greed.length, m = size.length;
        Arrays.sort(greed);
        Arrays.sort(size);
        int i = 0, j= 0;
        while(i<n && j<m){
            if(greed[i] <= size[j]){
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] greed = {1,2};
        int[] size = {1,2,3};
        System.out.println(assign(greed,size));

    }
}
