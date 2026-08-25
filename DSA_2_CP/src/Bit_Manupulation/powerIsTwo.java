package Bit_Manupulation;

public class powerIsTwo {
    public static boolean powerCheck(int n) {
        return n> 0 && (n &(n-1))==0;
    }
}
