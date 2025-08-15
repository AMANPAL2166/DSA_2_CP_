package Fundamental;

import java.util.Arrays;

//Euclidean algorithm for GCD
//https://www.geeksforgeeks.org/dsa/euclidean-algorithms-basic-and-extended/#basic-euclidean-algorithm-for-gcd
public class findGCD {
    public static void main(String[] args) {
        int a = 35;
        int b = 15;
        System.out.println(Arrays.toString(fidgcd_(a,b)));

    }
    static int[] fidgcd_(int a, int b) {
        //this is a form of array

        if (a == 0)
            return new int[]{b, 0, 1};
        int[] vals = fidgcd_(b%a, a);
        int gcd = vals[0];
        int x1 = vals[1];
        int y1 = vals[2];
        int x = y1 - (b/a) *x1;
        int y = x1;
        return new int[] {gcd, x,y};
    }
}
