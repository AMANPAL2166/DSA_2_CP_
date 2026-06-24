package Daily_Doze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class June24 {
    private static List<List<Integer>>  threeSum(int[] arr){
        //Given an array return list of array whose sum of threeplate ==0
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<arr.length-2;i++){
            //check duplicates of i
            if(i>0 && arr[i] == arr[i-1]) continue;;
            int j = i+1;
            int k = arr.length -1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==0){
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    while(j<k && arr[j] == arr[k]) j++;
                    while(j<k && arr[k] == arr[k-1]) k--;
                    j++;
                    k--;

                } else if (sum>0) {
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
    static void sort(ArrayList<Integer> arr){
        //base case
        if(arr.size()<=1) return;
        int temp = arr.remove(arr.size()-1);
        sort(arr);
        insert(arr,temp);

    }
    static void insert(ArrayList<Integer> arr, int temp){
        //Found correct position
        if(arr.size() == 0 || arr.get(arr.size()-1)<temp){
            arr.add(temp);
            return;
        }
        //Remove last element
        int val = arr.remove(arr.size()-1);
        //Temp ko insert karane ki jagah dundho
        insert(arr, temp);
        //Remove element vapas se add karo
        arr.add(val);
    }


    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans =threeSum(arr);
        for(List<Integer> i : ans){
            System.out.println(i);
        }


    }
}
