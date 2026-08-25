package Bit_Manupulation;

public class checkIthbits {
    //time and space both have o(log n) complexity
    public static boolean checkbit(int n , int i) {
        //convert int to binary string
        String binary = Integer.toBinaryString(n);
        //edge case if i> n return false
        if(i> binary.length()) return false;
        return binary.charAt(binary.length()-1-i) == '1';
    }

    public static boolean check(int n, int i) {
        return (n & (1<<i)) != 0;
    }

    public static void main(String[] args) {
        System.out.println(check(5,0));
    }

}
