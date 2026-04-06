package Recurssion;

public class Reverse_a_number {
    public static void main(String[] args) {
        int  n = 10384;
        //reverse n
        while(n!=0){
            int r = 1;
            r = r*10 + (n%10);
            n= n/10;
        }
    }
}
