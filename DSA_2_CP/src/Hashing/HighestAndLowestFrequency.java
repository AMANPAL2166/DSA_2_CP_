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

    public static void main(String[] args) {
         int array[] = {10,5,10,15,10,5};
        freq(array, array.length);
    }
}
