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
    public static int[] sortedSquares2(int[] nums){
        //Optimal method for square of array without using sort
        int[] ans = new int[nums.length];
        int start = 0;
        int end= nums.length-1;
        int pos = nums.length-1;
        while(start<=end){
            //square of left element
            int leftSqr = nums[start]*nums[start];
            //square of right element
            int rightSqr=nums[end]*nums[end];
            //check if rightsqr > leftsqr:then pos == rightsqr. Because larger element in the last
            if(leftSqr<rightSqr){
                ans[pos--] = rightSqr;
                end--;
            }else{
                ans[pos--] = leftSqr;
                start++;
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares2(arr)));
    }

}
