package NEETCODE.MATH_and_GROMETRY;

public class Pow {
    //given x and x
    public static double myPow(double x, int n){
        //Step 1: Use "long"  becoz int me me min.integer limit exeed ho skta hai
        long N = n;
        //Step 2: If n is negative then use simple mathmatics
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        double ans = 1;
        double current_product = x;
        //Step 3:Binary exponentiation logic (o(logn));
        while(N>0){
            //If power is odd, multiply ans
            if(N%2 == 1){
                ans = ans*current_product;
            }
            //Base ko square and power ko half karna hai
            current_product = current_product*current_product;
            N = N/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        double x= 2;
        int n = 4;
        System.out.println(myPow(x,n));
    }
}
