package ArrayList_;

import java.util.ArrayList;
import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {3,5,2,5};
        int[] ans = reve(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] reve(int[] arr){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(n);
        for(int i = n-1; i>=0; i--){
            res.add(arr[i]);
        }
        // convert arraylist into int
        int[] ress = new int[n];
        for(int i = 0; i<n; i++){
            ress[i] = res.get(i);
        }
        return ress;
    }
}
