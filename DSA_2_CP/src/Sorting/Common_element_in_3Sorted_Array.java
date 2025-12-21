package Sorting;
//Problem::- Given three sorted array in non decreasing order.
//Solution:: - 1) find the smallest length of the array.
//2) : run a for loop to the length of smallest array
// 3):: check condition of loop::i) try binary search to find the element;

import java.util.ArrayList;
import java.util.List;

public class Common_element_in_3Sorted_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 30};
        int[] arr2 = {5, 10, 15, 20};
        int[] arr3 = {5, 10, 20};

        List<Integer> common = commonelement(arr1, arr2, arr3);
        System.out.println(common);

    }

    public static List<Integer> commonelement(int[] arr1, int[] arr2, int[] arr3) {
        //Initialize list of result
        List<Integer> result = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;
        int smallestArray ;
        //find smallest array of a size
        if(n1<n2 && n1<n3){
            smallestArray = n1;
        } else if (n2<n1 && n2<n3) {
            smallestArray = n2;
        }else{
            smallestArray = n3;
        }
        //use three pointer approach on a sorted array
        int i = 0, j=0, k = 0;
        while(i<n1 && j<n2 && k<n3){
            if(arr1[i] == arr2[j] && arr2[j]==arr3[k]){
                result.add(arr1[i]);
                i++;j++;k++;//All matches move all the pointer
            } else if (arr1[i] < arr2[j] && arr1[j]<arr3[k]) {
                i++;//Move smaller pointer
            } else if (arr2[i] < arr1[j] && arr2[j]<arr3[k]) {
                j++;
            }else{
                k++;
            }

        }
        return result;



    }

}
