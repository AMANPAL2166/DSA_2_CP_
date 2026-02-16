package Recurssion;

public class PrintNtoOne {
    public static void printN(int n) {
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printN(n-1);

    }
    public static void increasing(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        increasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n= 10;
//       printN(n);
       increasing(n);
    }

}
