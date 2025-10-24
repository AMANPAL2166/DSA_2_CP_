package Fundamental;

public class Pcn {
    public static void main(String[] args) {
        int p = 23453522;
        int n = 2;
//        pcn(p,n);
        count(p,n);

    }

    public static void pcn(int p, int n ) {
        int pfac = 1;
        for(int i = 1; i<=p; i++){
            pfac *=i;
        }
        int nfac = 1;
        for(int i = 1; i<=p-n; i++){
            nfac *=i;
        }
        int pnc = pfac/nfac;
        System.out.println(p+"n"+n+"= "+ pnc);
    }

    public static void count(int n, int m) {
        int count = 0;
        while(n>0){
            int dig = n%10;
            n= n/10;
            if(dig==m){
                count++;
            }
        }
        System.out.println(count);
    }
}
