package Array;
//https://www.geeksforgeeks.org/dsa/write-a-program-to-reverse-digits-of-a-number/
public class reversenum {
    public static void main(String[] args) {
        int num = 1204;
        System.out.println(reverse(num));

    }
    public static int reverse(int n ){
        int revej = 0;
        while(n>0){
            revej = revej*10 + n%10;
            n = n /10;
        }
        return revej;
    }
}
