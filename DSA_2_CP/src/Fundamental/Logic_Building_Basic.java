package Fundamental;

import java.util.Arrays;
import java.util.List;

public class Logic_Building_Basic {
    public static void main(String[] args) {
        int s = 3, a =33;
        System.out.println("Check even or odd: "+even_odd(s));
        System.out.println("Sum of natural number: "+ sumof_Naturalnum(s));
        System.out.println("Square of n natural number: " + sumOf_squr(s));
        swap(s,a);
        System.out.println(" Swap a and b using XOR : " + get(s,a));
        System.out.println( "Closest number: " + closestNumber(s,a));
        System.out.println( "Closest number: " + closestNumber2(s,a));
        System.out.println("Opposite disc: " + Oppositeface_disc(a));
        System.out.println("This number is prime or not if prime then print true otherwise false: " + isPrime(s));
        System.out.println("power check; " + powercheck(1,20));
        System.out.println (check_valid_tri( 7,10,5));
        System.out.println(countPairs(9));
        System.out.println(pairCubeCount_Opt(28));
        System.out.println("LCM of " + s + " and " +a+ " = " + LCM_find(s,a));
        System.out.println("Method second to find LCM with better space complexity:::"+"LCM of " + s + " and " +a+ " = " + lcm(s,a));
        System.out.println("Perfect divisor: " + Divise_Perfect(a));
        System.out.println("Second method to find "+ "Perfect divisor: "+ isPerfect(a));
        add_fraction(1,3,1,5);
        System.out.println(getDayOfWeek(15,8,1947));
        System.out.println("Nth series: "+nthseries(3));
        System.out.println(knthdigit(3,2,1));

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
    static boolean isPrime(int n){
        if(n<=1){return false;}
        if(n == 2 || n == 3  ){ return true;}
        // if n is <=1, and divided by 2 and 3 then it is not prime
        if(n<=0 || n%2 == 0 || n%3==0){return false;}
        //to check through all number of the form 6k+-1
        for(int i = 5; i*i <=n; i++){
            if(n%i ==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static boolean powercheck(int x, long y) {
        if(x==1){ return (y==1);}
        //repetadely compute x power
        long pow = 1;
        while(pow<y)
            pow *=x;
        //check if power of x become y;
         return (pow==y);

    }

    public static boolean  check_valid_tri(int a, int b, int c) {
        if(a+b<=c || a+c<= b || b+c<=a){
            return false;
        }else{ return true;}

    }
    static int countPairs(int n) {//this is brute force of count pair of a number
         int count = 0;
         for(int a = 1; a<=n;a++){
             for(int b = 0; b<=0; b++){
                 if(a*a*a+b*b*b== n){
                     count++;
                 }
             }
         }
         return count;
    }
    //now I  want to optimize this sol^n;
    static int pairCubeCount_Opt(int n){
        int count = 0;
        for(int i = 1; i<=Math.cbrt(n);i++){
            int cb = i*i*i;//store cube of the number
            int diff = n-cb;//substract the cube from given number
            //check if difference is also a perfect cube
            int cbrtDiff = (int) Math.cbrt(diff);
            //If yes then increase count
            if(cbrtDiff*cbrtDiff*cbrtDiff == diff){
                count++;
            }
        }
        return count;
    }

    public static int  LCM_find(int a, int b) {
        int g = Math.max(a,b);
        int s = Math.min(a,b);
        for(int i = g; i<= a*b; i+=g){
            if(i % s ==0){
                return i;
            }
        }
        return a*b;

    }
    // Method 2nd to find
    static int gcd(int a, int b){
        return (b==0) ? a: gcd(b, a%b);
    }
    static int lcm(int a, int b){
        return (a/gcd(a,b))*b;
    }

    public static int Divise_Perfect(int n) {
        int sum = 0;
        for(int i = 1; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum ;
    }
    //Optimize method
    public static boolean isPerfect(int n){
        int sum = 1; // We start from 1 because 1 is a division of whole number::
        for(int i = 2; i*i <= n; i++ ){
            if(n % i == 0){
                if(i*i != 0){
                    sum = sum +i +n/i;
                }else{
                    sum =sum + i;

                }
            }
        }
        //If sum is divisor is equal to n, then n is a perfect number
        return sum == n && n != 1;
    }
    static void add_fraction(int num1, int den1, int num2, int den2nd){
        int lcm = LCM_find(den1,den2nd);
        int first = lcm/den1;
        int sec = lcm/den2nd;
        int ans = (first + sec)%lcm;
        System.out.println(ans);
    }
    static String getDayOfWeek(int d, int m, int y) {
        // code here
        if (m == 1) {
            m = 13;
            y -= 1;
        } else if (m == 2) {
            m = 14;
            y -= 1;
        }

        int q = d;
        int mon = m;
        int K = y % 100;
        int J = y / 100;

        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        return days[h];
    }

    public static int nthseries(int n) {
        int ans = 0;
        for(int i = 1;i <=n; i++){
            ans +=i;
        }
        return ans;

    }
    static long knthdigit(int a, int b, int k){
        //Given two numbers a and b, find kth digit from right of a^b.
        //ex -- Input: a = 3, b = 3, k = 1
        //Output: 7
        //Explanation: 33 = 27 and 1st digit from right is 7
        int result = 1;
        for(int i = 0; i<b; i++ ){
            result *= a;

        }
        return result;
    }






}
