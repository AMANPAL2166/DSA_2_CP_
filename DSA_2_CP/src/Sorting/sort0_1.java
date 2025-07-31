package Sorting;
//https://www.geeksforgeeks.org/dsa/sort-array-containing-two-types-elements/
public class sort0_1 {
    static void sort0and1(int[] arr) {
        int left = 0, right = 0;
        while(right < arr.length){
            if(arr[right] == 0 ){
                //swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        int[] arr= {0,0,0,0,1,1,0};
        sort0and1(arr);
       // System.out.println(sort0and1(arr));
    }



}
