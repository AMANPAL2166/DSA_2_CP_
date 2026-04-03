package NEETCODE.BINARY_SEARCH;

public class KOKO_Eating {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int i  = 0 ;i<piles.length;i++){
            high =  Math.max(high,piles[i]);
        }
        while(low<high){
            int mid = low+(high-low)/2;
            int hours = 0;
            for(int p :piles){
                hours+= (p+mid-1)/mid;

            }
            if(hours<=h){
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return low;

    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        System.out.println(minEatingSpeed(piles,8));
    }
}
