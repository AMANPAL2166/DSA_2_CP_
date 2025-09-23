package Recurssion;

public class isPoweroftwo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPowerOfTwo_(n));

    }
    public  static boolean isPowerOfTwo_(int n) {
        //base case
        if( n ==1){
            return true;
        }else if(n<1 || n%2 !=0 ){
            return false;

        }
        return isPowerOfTwo_(n/2);

    }
}
