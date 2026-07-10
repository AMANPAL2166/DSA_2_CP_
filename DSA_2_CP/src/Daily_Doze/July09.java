package Daily_Doze;

import static Fundamental.Logic_Building_Basic.swap;

public class July09 {
    //print name n times
    private static void nameNtimes(String name , int n){
        /// base case
        if(n==0) return;
        System.out.println(name);
        nameNtimes(name , n-1);
    }
    private static void sumOfNNum(int i , int sum){
        //base case
        if(i<1){
            System.out.println(sum );
            return ;
        }
        //Hypothetsis
        //sum+= i;// or sum+i in calling function
        sumOfNNum(i-1, sum+i);
        //Induction


    }
    private static void reverseArray(int[] nums, int i, int j){
        if(i>=j){
            return  ;
        }
        swap(nums[i], nums[j]);
        reverseArray(nums,i+1, j-1) ;
    }

    public static void swap(int i, int j) {
        int temp = i;
        i= j;
        j= temp;
    }


    //write a function to check, it is palindrome or not
    public static boolean checkPali(int idx, String s){
        //base case
        if(idx>= s.length()/2) return true;
        //condition
        if(s.charAt(idx) != s.charAt(s.length() - idx - 1)){
            return false;
        }
        //hypothessi
        return checkPali(idx+1, s);
    }
    public static boolean isPalindrome(String s) {
        //edge casess
        return check(0, s);
    }
    public static boolean check(int idx, String s){
        //base case
        if(idx>= s.length()/2) return true;
        //condition
        if(s.charAt(idx) != s.charAt(s.length() - idx - 1)){
            return false;
        }
        //hypothessi
        return check(idx+1, s);
    }
    public static void main(String[] args) {
        //nameNtimes("Aman", 5);

        //sumOfNNum(5,0);
//        int[] arr = {1,2,3,4,5};
//        reverseArray(arr, 0, arr.length-1);
//        for(int i : arr){
//            System.out.print(i +" ");
//        }
//        String s = "madam";
//        System.out.println(isPalindrome(s));
        System.out.println(  fibo(6));
    }
    private static int fibo(int n){
        if(n<=0){
            return 0;
        }
        if( n== 1) return 1;
        //System.out.println(n);
        int first = fibo(n-1);
       // System.out.println(n);
        int last = fibo(n-2);
        return first+last;
    }
}
