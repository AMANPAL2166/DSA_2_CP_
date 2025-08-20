package Fundamental;

import java.util.Arrays;
import java.util.List;

public class Logic_Building_Basic {
    public static void main(String[] args) {
        int s = 4, a =5;
        System.out.println("Check even or odd: "+even_odd(s));
        System.out.println("Sum of natural number: "+ sumof_Naturalnum(s));
        System.out.println("Square of n natural number: " + sumOf_squr(s));
        swap(s,a);
        System.out.println(" Swap a and b using XOR : " + get(s,a));

    }
    public static boolean even_odd(int n){
        if( n %2 == 0){
            return true;
        }else{
            return false;
        }

    }
    public static int sumof_Naturalnum(int n ){
        if(n == 0 ){
            return 0;
        }
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum += i;
        }
        return sum;
    }

    public static int sumOf_squr(int n) {
        if(n == 0){ return 0;}
        int sum = 0;
        for(int i = 1; i<= n; i++){
            sum += (i*i);
        }
        return sum;

    }

    public static void  swap(int a, int b ) {
        System.out.println(" a = "+a + " b = "+ b);
        //we need to swap a--
        int temp = a;
        a =b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);

    }
    // swap number without temp variable. We use XOR
    static List<Integer>  get (int a, int b){
        a = a^b;
        b = a^b;
        a= a^b;
        return Arrays.asList(a,b);
    }
}
