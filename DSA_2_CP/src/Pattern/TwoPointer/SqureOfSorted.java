package Pattern.TwoPointer;

import java.util.Arrays;

public class SqureOfSorted {
    public static int[] sortedSquares(int[] nums) {
        int[] newArray=  new int[nums.length];
        for(int i  = 0;i<nums.length;i++){
            int squre = nums[i] * nums[i];
            newArray[i] = squre;
        }
        Arrays.sort(newArray);
        return newArray;

    }
    //can we solve it using two pointer;
    public static int[] sortedSquares1(int[] nums) {
        int start = 0, end = nums.length-1;
        int[] newArray = new int[nums.length];
        while(start<=end){
            int squareFront = nums[start]*nums[start];
            int squareEnd = nums[end]*nums[end];
            newArray[start] = squareFront;
            newArray[end] = squareEnd;
            start++;
            end--;
        }
        Arrays.sort(newArray);
        return newArray;


    }


    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares1(arr)));
    }

}
