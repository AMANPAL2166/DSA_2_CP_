package ArrayList_;

import java.util.ArrayList;

public class ADDtwoSUM {
    public static ArrayList<Integer> twosum(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans= new ArrayList<>();
        int maxLength;
        if(arr1.length>arr2.length){
            maxLength = arr1.length;
        }else{
            maxLength = arr2.length;
        }
        for(int i = maxLength;i>=0;i--){
            boolean carray = false;
            int sum = arr1[i] + arr2[i];
//            if(sum)

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Just checking !!");
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2};
        ArrayList<Integer> res = twosum(arr1,arr2);
        for(int i : res){
            System.out.println(i);
        }
    }
}
