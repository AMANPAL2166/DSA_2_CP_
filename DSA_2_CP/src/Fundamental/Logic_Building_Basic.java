package Fundamental;

import java.util.Arrays;
import java.util.List;

public class Logic_Building_Basic {
    public static void main(String[] args) {
        int s = 13, a =4;
        System.out.println("Check even or odd: "+even_odd(s));
        System.out.println("Sum of natural number: "+ sumof_Naturalnum(s));
        System.out.println("Square of n natural number: " + sumOf_squr(s));
        swap(s,a);
        System.out.println(" Swap a and b using XOR : " + get(s,a));

        System.out.println( "Closest number: " + closestNumber(s,a));
        System.out.println( "Closest number: " + closestNumber2(s,a));
        System.out.println("Opposite disc: " + Oppositeface_disc(a));

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

     static int  closestNumber(int n, int m ) { // This function fail multiple test cases
        int rem = n%m;
        int num1 = n - rem;
        int num2;
        // Handle negative properly
         if(n<0){
             num2 = n - rem - m;

         }else{
             num2  = n-rem+m;

         }
         //check distance
         int dist1 = Math.abs(n-num1);
         int dist2 = Math.abs(n- num2);
         if(dist1<dist2) return num1;
         else if (dist2 <dist1) return num2;
         else return (Math.abs(num1) > Math.abs(num2))? num1 : num2;

    }
    static int closestNumber2(int n, int m){
        int q =n/m;
        //first possible closest number
        int n1 = m*q;
        //second possible closest number
        int n2 = (n*m)>0?(m*(q+1)) : (m*(q-1));
        //if true, then n1 required closet number
        if(Math.abs(n-n1)<Math.abs(n-n2)) return n1;
        //else n2 is the required closest number
        return n2;

    }
    static int Oppositeface_disc(int n){
        int ans = 0;
        if( n ==1){ ans = 6;}
        else if(n==2) ans = 5;
        else if(n==3) ans = 4;
        else if(n==4) ans = 3;
        else if(n==5) ans = 2;
        else ans = 1;
        return ans;
    }
}
