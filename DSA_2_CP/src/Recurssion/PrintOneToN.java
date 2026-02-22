package Recurssion;

public class PrintOneToN {
    public static void print(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }
}
