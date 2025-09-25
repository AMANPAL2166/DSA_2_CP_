package Recurssion;

public class factorial {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("factorial:- "+fact(n));


    }
    public static int factorial(int n){
        //base case
        if(n<=1){
            return 1;

        }
        return n*factorial(n-1);

    }
    public static int fact(int n ){
        //base case
        if(n<=1){
            return 1;
        }
        int fac = fact(n-1);
        int fac1 = n*fac;
        return fac1;
    }
}
