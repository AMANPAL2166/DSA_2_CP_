package Sorting;

public class missingNum {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missing(nums));

    }

    public  static int  missing(int[] num) {
//        int n = num.length;
//        int bigno = 0;
//        for (int i = 0 ; i<n; i++){
//            if(num[i] > bigno){
//                bigno = num[i] ;
//            }
//        }
//        int j = 0;
//        while(j<=bigno)
//
//        }
        for(int i = 0; i< num.length; i++){
            while(num[i] == i){
                if(num[i] == i){
                    i++;
                }else{
                    return i;
                }
            }
        }
        return -1;



    }
}
