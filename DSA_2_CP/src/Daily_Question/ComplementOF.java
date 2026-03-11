package Daily_Question;

public class ComplementOF {
    public static  int bitwiseComplement(int n) {
       //BitManupulation problem
        /// check edge case
        if(n==0) {
             return 1;
        }
        int mask = 0;
        int temp = n;
        //Logic of making mask: while temp > 0, fill mask with 1
        while(temp>0){
            mask = (mask<<1) |1;
            temp>>=1;
        }
        return n^mask;


    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(bitwiseComplement(n));
    }
}
