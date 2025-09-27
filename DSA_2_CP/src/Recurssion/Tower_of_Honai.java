package Recurssion;

public class Tower_of_Honai {
    public static void main(String[] args) {
        int n = 3,  d =10, e=20, f=30;
        toh(n, d, e,f);

    }

    public static void toh(int n, int t1id, int t2id, int t3id) {
        if(n==0){
            return;
        }
        toh(n-1, t1id, t3id, t2id);
        System.out.println(n+"[" + t1id + "->"+ t2id + " "+"]" ) ;
        toh(n-1, t3id, t2id, t1id);

    }
}
