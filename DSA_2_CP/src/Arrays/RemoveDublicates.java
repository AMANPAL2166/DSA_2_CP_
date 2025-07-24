package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDublicates {
   ArrayList<Integer> removeDublicates(int[] arr){
      ArrayList<Integer> result = new ArrayList<>();
      HashSet<Integer> seen = new HashSet<>();
      for (int i = 0; i < arr.length; i++){
         if(!seen.contains(arr[i])){
            result.add(arr[i]);
            seen.add(arr[i]);
         }

      }
      return result;

   }

}
