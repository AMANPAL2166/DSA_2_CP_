package NEETCODE.GREEDY;

import java.util.Arrays;

public class MinimumPlatform {
    public static int countPlatform(int[] arriv, int[] dep, int n) {
        int ans = 1;
        //loop over all arrival time
        for(int i = 0;i<n;i++){
            //Initialize count of overlapoing intervals
            int count = 1;
            for(int j = i+1;j<n;j++){
                //conditions
                if((arriv[i] >=arriv[j] && arriv[i] <= dep[j]) || (arriv[j] >= arriv[i] && arriv[j] <= dep[i])){
                    count++;
                }

            }
            ans = Math.max(ans, count);

        }
        return ans;
    }
    public static int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms = 0;
        int maxPlatform = 0;
        int i = 0;
        int j = 0;
        while(i<arr.length){
            if(arr[i] <= dep[j]){
                platforms++;
                i++;
            }else{
                platforms--;
                j++;
            }
            maxPlatform = Math.max(maxPlatform, platforms);
        }

        return maxPlatform;
    }
    public static void main(String[] args) {
        int[] arr = {900, 945, 955, 1100, 1500, 1800};
        int[] dep = {920, 1200, 1130, 1150, 1900, 2000};
        int n = arr.length;
        System.out.println("Minimum number of Platforms required " +
                minPlatform(arr, dep));
    }
}
