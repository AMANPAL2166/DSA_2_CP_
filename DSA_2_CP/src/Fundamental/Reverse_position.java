package Fundamental;

public class Reverse_position {
    public static void main(String[] args) {
        int n = 23415;
        int inv = 0, op =1;
        while(n!=0){
            int od = n%10;
            int id  = op;
            int ip = od;
            //make changes using id and od
            inv = inv+id*(int)Math.pow(10, ip-1);
            n = n/10;
            op++;

        }
        System.out.println(inv);
    }
}
