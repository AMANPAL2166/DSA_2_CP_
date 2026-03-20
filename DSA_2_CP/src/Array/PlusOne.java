package Array;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        // ArrayList<Integer> ans = new ArrayList<>();
        for(int i = n-1;i>=0;i--){
            if(digits[i] <  9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int[] ans = plusOne(arr);
        System.out.print ("[");
        for(int i = 0;i<ans.length;i++){
            System.out.print (ans[i]+" ");
        }
        System.out.print ("]");
    }
}
