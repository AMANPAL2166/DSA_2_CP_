package Two_Pointer;
//Input: arr[] = [3, 2, 2, 3], ele = 3
//Output: 2
//Explanation: The answer is 2 because there are 2 elements which are not equal to 3 and arr[] will be modified such that the first 2 elements contain the elements which are not equal to 3 and remaining elements can contain any element. So, modified arr[] = [2, 2, _, _]
//
//Input: arr[] = [0, 1, 3, 0, 2, 2, 4, 2], ele = 2
//Output: 5
//Explanation: The answer is 5 because there are 5 elements which are not equal to 2 and arr[] will be modified such that the first 5 elements contain the elements which are not equal to 2 and remaining elements can contain any element. So, modified arr[] = [0, 1, 3, 0, 4, _, _, _]

public class removeallOccurance {
    public static int getoccurrence(int[] arr, int ele) {
        //initialize counter of element whose not equal
        int count = 0;
        for(int i =0; i<arr.length; i++){
            //Place the element which is not equal to element at the kth
            if(arr[i] != ele){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int key = 2;
        System.out.println(getoccurrence(arr,key));
    }

}
