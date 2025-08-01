package Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

///Given an array of integers arr[], sort the array according to the frequency of elements,
///  i.e. elements that have higher frequency comes first. If the frequencies of two elements are the same, then the smaller number comes first.
///Input: arr[] = [5, 5, 4, 6, 4]
/// Output: [4, 4, 5, 5, 6]
/// Explanation: The highest frequency here is 2. Both 5 and 4 have that frequency.
/// Now since the frequencies are the same the smaller element comes first. So 4 4 comes first then comes 5 5. Finally comes 6.
/// The output is 4 4 5 5 6.
/// https://www.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1
public class sort_decreasingFreq {
    public ArrayList<Integer> sortbyFreq (int arr[]){
        //count frequency using Hashmap;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        //Converst array to list for sorting
        ArrayList<Integer> result = new ArrayList<>();
        for(int num: arr){
            result.add(num);
        }
        //Sort based on frequency
        result.sort((a,b) ->{
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if(freqA != freqB){
                return freqB- freqA;//Higher frequency first
            }else {

                return a-b;
            }
        });
        return result;

    }

    public static void main(String[] args) {
        int arr[] = {5, 5, 4, 6, 4};
        //Create object of the class because there are no static
        sort_decreasingFreq obj = new sort_decreasingFreq();
        //call the method using the object
        ArrayList<Integer> result = obj.sortbyFreq(arr);
        System.out.println(result);


    }
}
