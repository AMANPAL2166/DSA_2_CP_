package NEETCODE.GREEDY;

public class lemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int i = 0;i<bills.length;i++){
            if(bills[i] == 5){
                five++;
            } else if (bills[i] == 10 ) {
                if(five>=1){
                    five--;
                    ten++;
                }else{
                    return false;
                }

            } else if (bills[i] == 20) {
                if(ten >=1 && five>=1){
                    ten--;
                    five--;
                } else if (five>=3) {
                    five = five-3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills = { 10,20};
        System.out.println(lemonadeChange(bills));
    }
}
