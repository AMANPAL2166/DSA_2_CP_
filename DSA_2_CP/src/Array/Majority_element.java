package Array;
 // Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.
 //
 //Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.
 //
 //Examples:
 //
 //Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
 //Output: 1
 //Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.
//👉🏻https://www.geeksforgeeks.org/problems/majority-element-1587115620/1
public class Majority_element {
    int majority_ele(int arr[]){
        int n = arr.length;
        //Naive approach
        int max_element= n/2;
        int count= 1;
        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > max_element){
                return arr[i];
            }

        }
        return -1;

    }

     public static void main(String[] args) {
         int arr[] = {1,1,2,1,3,5,1};
         Majority_element obj  = new Majority_element();
         System.out.println(obj.majority_ele2(arr));
     }
     int majority_ele2(int arr[]){
        // here we're going to solve this method using Moore's voting algorithms;
         int n = arr.length;
         int candidate = -1;
         int count = 0;
         //find candidate
         for(int num: arr){
             if(count==0){
                 candidate = num;
                 count = 1;

             }else if(num==candidate){
                 count++;

             }else{
                 count--;
             }
         }
         // validate the candidate
         count = 0;
         for(int num: arr){
             if(num==candidate){
                 count++;
             }
         }
         //If count is greater than n/2 then return candidate otherwise return -1
         if(count>n/2){
             return candidate;
         }else{
             return -1;
         }


     }

}
