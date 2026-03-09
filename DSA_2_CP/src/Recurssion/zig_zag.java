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
        System.out.println("Pre: "+num);
        zig(num-1);
        System.out.println("In: "+num);
        zig(num-1);
        System.out.println("Post: " + num);

    }
}
