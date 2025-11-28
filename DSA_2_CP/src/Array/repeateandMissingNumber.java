package Array;

import java.util.Arrays;
import java.util.HashSet;

public class repeateandMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5 ,3};
        System.out.println(Arrays.toString(repeatedNumber(arr)));
//        repeatedNumber(arr)

    }
    public static int[] repeatedNumber(final int[] A) {
        HashSet<Integer> duplicates = new HashSet<>();
        int[] res = new int[2];
        for(int i = 0; i< A.length; i++){

            if(duplicates.contains(A[i])){
                res[0] = A[i];

            }
            duplicates.add(A[i]);
        }
        System.out.println(duplicates);
//        System.out.println(Arrays.toString(A));
        for (int i = 1; i <= A.length; i++) {
            if (!duplicates.contains(i)) {
                res[1] = i;
                break;
            }
        }


        return res;

    }
}
