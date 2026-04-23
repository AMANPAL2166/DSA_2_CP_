package NEETCODE.MATH_and_GROMETRY;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        //If there is a cycle, fast will eventally meet slow.
        //If the number is happy, fast will reach 1.
        while(fast != 1 && slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }
    private static int getNext(int n){
        int totalSum = 0;
        while(n>0){
            int d = n%10;
            n =n/10;
            totalSum += d*d;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(11));
    }
}
