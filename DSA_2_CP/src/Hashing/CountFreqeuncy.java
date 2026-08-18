package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFreqeuncy {
    public static void countFrequency(int[] arr) {
        //Problem statement: Given an array, we have found the number of occurences of each element in the array.
        //Approach:
        //Create a visited array to mark element that are already visited
        boolean[] visited = new boolean[arr.length];
        //traverse through all element of the array
        for(int i = 0;i<arr.length;i++){
            //skit the element if it's already visited
            if(visited[i]) continue;
            //count frequency
            int count = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;//marked as visited
                    count++;//increase count of number
                }
            }
            System.out.println(arr[i] + " frequency of the element " + count);
            //Time & space complexity of the method is O(N) and space is also same
        }
    }

    public static void HashArrayfrequency(int[] arr) {
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //create a hashtable with length of max+1
        int[] hashTable = new int[max+1];
        for(int i = 0;i<arr.length;i++){
            hashTable[arr[i]] +=1;
        }
        for(int i=0;i<hashTable.length;i++){
            if(hashTable[i] > 0){
                System.out.println(i + " frequency of the element " + hashTable[i]);
            }
        }
        //This method also has same time and space complexity

    }
    //we can optimized it using map-method
    public static void freqHashMap(int[] arr) {
        //Create a hashMap to store frequency of each element
        HashMap<Integer, Integer> map  = new HashMap<>();
        //Traverse the array and count frequencies
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        //Traverse through the hashmap and print frequencies
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        freqHashMap(arr);
    }

}
