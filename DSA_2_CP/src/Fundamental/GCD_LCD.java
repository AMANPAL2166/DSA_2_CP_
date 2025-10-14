package Fundamental;

public class GCD_LCD {
    public static void main(String[] args) {
        int x = 36;
        int y = 24;
        int ox = x;
        int oy = y;
        while(x%y != 0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        int gcd = y;
        int lcd = (ox*oy)/gcd;
        System.out.println(gcd);
        System.out.println(lcd);

    }
}
