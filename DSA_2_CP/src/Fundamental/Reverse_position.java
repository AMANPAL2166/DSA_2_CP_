package Fundamental;

public class Reverse_position {
    public static void main(String[] args) {
        int n = 23415;
        int inverse = 0, original_posi =1;
        while(n!=0){
            int original_digit = n%10;
            int inverted_digit  = original_posi;
            int inverted_place = original_digit;
            //make changes using id and od
            inverse = inverse+inverted_digit*(int)Math.pow(10, inverted_place-1);
            n = n/10;
            original_posi++;

        }
        System.out.println(inverse);
    }
}
