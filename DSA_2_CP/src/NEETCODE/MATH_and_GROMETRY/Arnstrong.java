package NEETCODE.MATH_and_GROMETRY;

public class Arnstrong
{
    public static boolean checkArmstrong(int n) {
        int dup = n;
        int sum = 0;
        int digitsInN = digitscoutn(n);
        while (n>0){
            int lastDigit = n%10;
            sum += Math.pow(lastDigit,digitsInN);
            n = n/10;

        }
        if(sum == dup)return true;
        return false;

    }

    private static int digitscoutn(int n) {
        int count = 0;
        while (n>0){
            count++;
            n= n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 371;
        System.out.println(checkArmstrong(n));
    }
}
