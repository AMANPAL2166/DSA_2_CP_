package Hashing;

public class HighestAndLowestFrequency {
    public static void freq(int[] arr, int n) {
        //Edge cases
        //Find largest ele in the given array
        int maxEle = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }
        //make hashTable length of maxEle +1;
        int[] hashTable = new int[maxEle+1];
        for(int i = 0;i<n;i++){
            hashTable[arr[i]] += 1;
        }
        //make maxFreq and minFrequnce variable to store and track
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;
        //iterate to the arr
        for(int i = 0;i<hashTable.length;i++){
            if(hashTable[i] >0){
                if(maxFreq < hashTable[i]){
                    maxFreq = i;
                }
                if(minFreq> hashTable[i]){
                    minFreq = i;
                }
            }

        }
        //return maxFreq and minFre
        System.out.println("Min frequency count is " + minFreq);
        System.out.println("Max frequency count is " + maxFreq) ;
    }

    public static void countFreq(int[] arr, int n) {
        //make a boolean array to count visited element
        //make maxFreq, maxEle, minfreq, minEle variable
        //traverse from left to right of the array
        //check if they already visited skip that ele
        //otherwise: run another loop and initialize scoper variable called count
        //check if count > maxFreq then change maxFre to count and ele with arr[i], repeate same thing for minferq
        boolean[] visited = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for(int i = 0;i<arr.length;i++){
            if(visited[i]) {
                continue;
            }
            int count = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;//mark as counted
                    count++;
                }
            }
            if(maxFreq<count){
                maxFreq = count;
                maxEle = arr[i];

            }
            if(minFreq>count){
                minEle = arr[i];
                minFreq = count;

            }
        }
        // Print final results
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

    }

    public static void main(String[] args) {
         int array[] = {10,5,10,15,10,5};
        countFreq(array, array.length);
    }
}
