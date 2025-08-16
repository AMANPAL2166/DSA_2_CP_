package Array;

import java.util.HashSet;

public class TwoSum_Pair {
    public static void main(String[] args) {
        int arr[] = {2,4,2,-4,-2};
        int target = 1;
        TwoSum_Pair obj = new TwoSum_Pair();
        System.out.println(obj.twoSum(arr,target));

    }
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i= 0; i<arr.length; i++){
            //Calculate the component that added to
            //arr[i], equals the target
            int component = target - arr[i];
            //Check if the component exist in the
            if(set.contains(component) ){
                return true;
            }
            //Add the corrent element to the set
            set.add(arr[i]);
        }
        //If no of pair found
        return false;
    }
}
