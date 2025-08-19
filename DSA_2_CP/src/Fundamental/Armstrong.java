package Fundamental;
//https://www.geeksforgeeks.org/dsa/program-for-armstrong-numbers/
public class Armstrong {
    //Given a number x, determine whether the given number is Armstrong's number or not. A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if
    //
    //abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
    //
    //Here a, b, c and d are digits of input number abcd.....
    //
    //Examples
    //
    //Input: n = 153
    //Output: true
    //Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153
    //
    //Input: n = 9474
    //Output: true
    //Explanation: 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474
    //
    //Input: n = 123
    //Output: false
    //Explanation: 1³ + 2³ + 3³ = 1 + 8 + 27 = 36
    public static void main(String[] args) {
        int a = 153;
        if(armstron(a)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static int power(int x, int y){
        if(y==0){
            return 1;
        }
        if(y%2 == 0){
            return power(x,y/2)*power(x,y/2);
        } return x*power(x,y/2)*power(x,y/2);

    }
    //Function to count number of digits
    public static int order(int n ){
        int t = 0;
        while( n !=0){
            t++;
            n=n/10;
        }
        return t;
    }
    //Function to check whether the given number is armstrong or not
    public static boolean armstron(int n){
        int x = order(n);
        int temp = n, sum = 0;
        while (temp != 0){
            int r = temp % 10;
            sum+= power(r,x);
            temp = temp/10;
        }
        return sum==n;
    }


}
