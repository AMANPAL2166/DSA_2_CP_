package Array;
//Given an array arr[] of positive integers where every element appears even times except for one. Find that number occurring an odd number of times.
//
//Examples:
//
//Input: arr[] = [1, 1, 2, 2, 2]
//Output: 2
//Explanation: In the given array all element appear two times except 2 which appears thrice.
public class Single_num {
    int single_num(int arr[]){// Naive approach ( Time & space complexity = N**2)
        for(int i = 0; i<arr.length ; i++){
             int count = 0;
             for(int j = 0 ; j<arr.length; j++ ){
                 if(arr[j] == arr[i] ){
                     count++;
                 }
            }
             if(count == 1){
                 return arr[i];
             }
        }
        return -1;
    }
    int sin_num(int arr[]){ // Optimize approach using (n) time & space complexity
        //using XOR method
        int res = 0;
        for(int num : arr){
            res^=num;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 2, 2, 5, 3};
        Single_num obj = new Single_num();
        System.out.println(obj.single_num(arr));
    }
}
