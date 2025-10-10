package Recurssion;

public class zig_zag {
    public static void main(String[] args) {
        int n = 2;
        zig(n);
    }

    public static void  zig(int num) {
        //base case
        if(num == 0){
            return ;
        }
        System.out.println("Line 1st: "+num);
        zig(num-1);
        System.out.println("Line 2nd: "+num);
        zig(num-1);
        System.out.println("Line 3rd: " + num);

    }
}
