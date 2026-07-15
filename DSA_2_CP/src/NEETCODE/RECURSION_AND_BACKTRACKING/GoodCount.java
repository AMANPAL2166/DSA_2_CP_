package NEETCODE.RECURSION_AND_BACKTRACKING;

public class GoodCount {
    public static int countGoodNumbers(long n) {
        int totalNum = 1;
        for(int i = 0;i<n;i++){
            if(i%2 == 0){
                totalNum *= 5;
            } else {
                totalNum *= 4;
            }
        }
        return totalNum;

    }
    private static int longPower(long x, long n){
        //base case
        if(n == 0){
            return 1;
        }
        if(n %2 == 0){
            int even = longPower(x, n/2);
            return even*even;
        }else{
            int odd = longPower(x,n/2);
            return (int)(odd*odd*x);
        }

    }
    private static int countGoodNums(long n){
        long even = (n+1)/2;
        long odd = n/2;
        return longPower(5, even)*longPower(4, odd);
    }

    public static void main(String[] args) {
        System.out.println(countGoodNums(4));
    }
}
