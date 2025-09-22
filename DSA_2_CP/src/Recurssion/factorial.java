package Recurssion;

public class factorial {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("factorial:- "+factorial(n));


    }
    public static int factorial(int n){
        //base case
        if(n<=1){
            return 1;

        }
        return n*factorial(n-1);

    }
}
