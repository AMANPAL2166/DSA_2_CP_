package Fundamental;

public class Find_pythagorean {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int max = a;
        if(b>max){
            max = b;


        }else if(c>max){
            max = c;

        }
        if(max == a){
            boolean check = (((b*b + c*c))==(a*a));
            System.out.println(check);
        }else if(max == b){
            boolean check = (((a*a + c*c))==(b*b));
            System.out.println(check);
        }else{
            boolean check = (((a*a + b*b))==(c*c));
            System.out.println(check);
        }

    }
}
