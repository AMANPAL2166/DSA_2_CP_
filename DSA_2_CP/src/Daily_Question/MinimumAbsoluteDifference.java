package Daily_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        //Sort the array
        Arrays.sort(arr);
        int mindifference = Integer.MAX_VALUE;
        int n = arr.length;
        //Find the minimum absolute difference
        for(int i = 0; i<n-1;i++){
            mindifference = Math.min(mindifference, arr[i+1]-arr[i] );
        }
        //Step3 :collect all pairs with the minimum difference;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<n-1;i++){
            if(arr[i+1] - arr[i] == mindifference){
                result.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,3};

        System.out.println(minimumAbsDifference(arr));
    }
}
