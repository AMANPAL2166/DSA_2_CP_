package Recurssion;

public class Multi_recursion {
    public static void main(String[] args) {
        int n = 2;
        zigzag(n);

    }

    public static void zigzag(int n) {
        if(n==0){
            return ;
        }
        System.out.println("Pre" + n);
        zigzag(n-1);
        System.out.println("IN" + n);
        zigzag(n-1);
        System.out.println("Post"+n);

    }
}
