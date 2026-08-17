package Hashing;

import java.util.Arrays;

public class Fundamental {
    //. Hashing Ke Types
    //1- Number types(Array based)
    //Maan lo tumhare paas ek numbers ki list (array) hai: [1, 2, 1, 3, 2]
    //
    //Tumse pooched questions (queries) hain:
    //
    //1 kitni baar aaya?
    //
    //3 kitni baar aaya?
    //
    //4 kitni baar aaya?
    public static int queryCount(int[] arr, int num) {
        //this method take o(n) time complexity
        //if we have m querys and o(n) this will be like O(m*n), for 10^5 query give TLE. So we should try hashing array based index count to make it faster.
        int count = 0;
        for(int n: arr){
            if(arr[n] == num) count++;
        }
        return count;
    }
    //hashing method
    public static int queryCountHashing(int[] arr, int num) {
        //first find max element in the array to make hashtable
        int maxEle = 0;
        for(int i:arr){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }
        //make a hashtable maxEle + 1 size
        int[] hashTable = new int[maxEle+1];
        Arrays.fill(hashTable,0);
        //if query num > max return 0;
        if(num> maxEle) return 0;
        //traverse array and add index if we fount it
        for(int i: arr){
            hashTable[arr[i]] +=1;
        }
        //access index and return
        return hashTable[num];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        System.out.println(queryCount(arr,1));
        System.out.println(queryCount(arr,2));
        System.out.println(queryCount(arr,3));
        System.out.println(queryCount(arr,4));
        System.out.println("This is hashing method.");
        System.out.println(queryCountHashing(arr,1));
        System.out.println(queryCountHashing(arr,2));
        System.out.println(queryCountHashing(arr,3));
        System.out.println(queryCountHashing(arr,4));


    }
}
