package Array;
//Given an array arr[] of size n, the task is to rearrange it in alternate positive and negative manner without changing the relative order of positive and negative numbers. In case of extra positive/negative numbers, they appear at the end of the array.
//
//Note: The rearranged array should start with a positive number and 0 (zero) should be considered as a positive number.

import java.util.ArrayList;

//https://www.geeksforgeeks.org/dsa/rearrange-array-alternating-positive-negative-items-o1-extra-space/
public class rearrangeby_sign {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(-4);
        arr.add(-9);
        arr.add(-1);
        arr.add(-7);
        arr.add(1);
        arr.add(-5);
        arr.add(-6);

        System.out.println("Original Array: " + arr);

        rearrange(arr);

        System.out.println("Rearranged Array: " + arr);
    }
    static void rearrange(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();

        for(int i = 0; i<n; i++ ){
            if(arr.get(i)>=0){
                positive.add(arr.get(i));
            }else{
                negative.add(arr.get(i));
            }
        }
        ///Merge them in alternate fashin
        int i = 0, p = 0, ne = 0;
        while(p<positive.size() &&  ne< negative.size()){
            if(i%2 == 0){
                arr.set(i++, positive.get(p++));
            }else{
                arr.set(i++, negative.get(ne++));
            }
        }
        //append remaining positive
        while(p<positive.size()){
            arr.set(i++, positive.get(p++));
        }
        while(ne < negative.size()){
            arr.set(i++, negative.get(ne++));
        }


    }
}
